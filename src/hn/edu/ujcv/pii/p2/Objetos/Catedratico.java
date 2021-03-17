package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Date;

public class Catedratico extends Persona{
    private int codigo;

    public Catedratico(){
        super();
    }
    Catedratico (int codigo, long id, String nombre , Date fecha){
        super(id, nombre, fecha);
        this.codigo= codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
