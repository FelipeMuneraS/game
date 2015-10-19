
package Modelo;

import java.util.Random;

public class Prueba1 extends Desafio{
    
    public boolean[] controlador = new boolean[10];
        
    public Prueba1() {
        Random r = new Random();
        int i = r.nextInt(9)+1;
        String p = "../Recursos/Prueba1/P"+i+".jpg";
        System.out.println(p);
        setPregunta(p);
        String[] opciones = new String[3];
        opciones[0] = "../Recursos/Prueba1/R1.jpg";        
        opciones[1] = "../Recursos/Prueba1/R2.jpg";
        opciones[2] = "../Recursos/Prueba1/R3.jpg";
        setOpciones(opciones);
        switch(i){
            case 1: case 2: case 3:
                setOpcionCorrecta(1);
                break;
            case 4: case 5: case 6:
                setOpcionCorrecta(2);
                break;
            case 7: case 8: case 9:
                setOpcionCorrecta(3);
                break;
        }
        p = "¿Cuál es la métrica que representa a los siguientes compases?";
        setDescripcion(p);
    }
    
}
