package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Date;

public class Periodo {
    private String descripcion;
    private int id;
    private Date fechafin;
    private Date fechaInicio;

    public Periodo(){

    }
    Periodo(int id, String descripcion, Date fechaDeInicio, Date fechafin){
        this.descripcion = descripcion;
        this.id = id;
        this.fechafin = fechafin;
        this.fechaInicio = fechaDeInicio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getId() {
        return id;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

}

