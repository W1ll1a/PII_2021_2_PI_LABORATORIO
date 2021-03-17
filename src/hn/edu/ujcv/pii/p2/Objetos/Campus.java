package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Date;

public class Campus {
    private String Direccion;
    private Date fechaDeInicio;
    private int id;
    private String nombre;
    public Campus(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

}
