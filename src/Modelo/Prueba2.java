
package Modelo;

import java.util.Random;

public class Prueba2 extends Desafio {
    public Prueba2() {
        Random r = new Random();
        int i = r.nextInt(4)+1;
        String p = "/Recursos/Prueba2/P"+i+".mid";
        setPregunta(p);
        String[] opciones = new String[3];
        opciones[0] = "../Recursos/Prueba2/R1.jpg";        
        opciones[1] = "../Recursos/Prueba2/R2.jpg";
        opciones[2] = "../Recursos/Prueba2/R3.jpg";
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
        p = "¿Cuál es la métrica que representa a la siguiente melodia?";
        setDescripcion(p);
    }   
}
