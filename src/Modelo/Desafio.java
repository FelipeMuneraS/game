
package Modelo;

public class Desafio {
    
    private String pregunta;
    private String[] opciones;
    private String descripcion;
    private int opcionCorrecta;
    private Estacion estacion;
    private Dificultad dificultad;

    public String getPregunta() {
        return pregunta;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setOpcionCorrecta(int opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }
       
    
}
