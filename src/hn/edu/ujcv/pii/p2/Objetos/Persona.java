package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Date;

public class Persona {
    public Persona(){

    }
    private long id;
    private String nombre;
    private Date fechaDeNacimiento;

    Persona(long id, String nombre , Date fechaDeNacimiento){
        this.id = id;
        this.fechaDeNacimiento= fechaDeNacimiento;
        this.nombre = nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
    public void setFechaDeNacimiento(Date fechaDeNacimiento){
        this.fechaDeNacimiento= fechaDeNacimiento;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public int calcularEdad (Date fechaDeNacimiento){
        int age = fechaDeNacimiento.getYear();
        return age;
    }
}

