package hn.edu.ujcv.pii.p2.Objetos;

public class Carrera {
    private int id;
    private String nombre;
    public Carrera(){
    }
    Carrera (int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
