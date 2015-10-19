package Modelo;

import java.io.File;
import javax.sound.midi.MidiFileFormat;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Reproductor extends Thread{
    
    private String sonido;
    private int t;
    private Sequencer seq;
    private boolean bandera = true;
    @Override
    public void run(){
         try{
            File f2 = new File(File.class.getResource(sonido).getPath());
            MidiFileFormat mff2;
            mff2 = MidiSystem.getMidiFileFormat(f2);
            Sequence S=MidiSystem.getSequence(f2);
            seq=MidiSystem.getSequencer();
            seq.open();
            seq.setSequence(S);
            seq.start();
        }catch(Exception e){}
        try{
            if(bandera){
                this.sleep((t*1000));
                this.interrupt();
            }
        }catch(Exception e){}
    }
    @Override
    public void interrupt(){
        seq.stop();
        seq.close();
        super.interrupt();
    }
    public void start(String a, int b){
        this.sonido = a;
        this.t = b;
        this.start();
    }
    public void start(String a){
        this.sonido = a;
        this.bandera = false;
    }
}
