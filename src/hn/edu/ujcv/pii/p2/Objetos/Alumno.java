package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Date;

public class Alumno extends Persona{
    private long Cuenta;

    public Alumno(){
        super();
    }
        Alumno(long cuenta, int id, String nombre, Date fechaDeNacimiento){
        super(id,nombre,fechaDeNacimiento);
        this.Cuenta= cuenta;
        }

    public void setCuenta(long cuenta) {
        Cuenta = cuenta;
    }

    public long getCuenta() {
        return Cuenta;
    }
}
