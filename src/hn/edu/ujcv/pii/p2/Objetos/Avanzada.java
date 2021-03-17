package hn.edu.ujcv.pii.p2.Objetos;

public class Avanzada extends Clase{
    private int valorVinculacion;
    private boolean tieneVinculacion;
    Avanzada(boolean tieneVinculacion,int id, String nombre,int unidadesValorativas, int NA1, int NA2,int NA3, int NE,
             int NR, int ValorVinculacion){
        super(id,NA1,NA2,NA3,NE,NR,nombre,unidadesValorativas);
        this.tieneVinculacion = tieneVinculacion;
        this.valorVinculacion =ValorVinculacion;
    }

    public int getValorVinculacion() {
        return valorVinculacion;
    }

    public void setValorVinculacion(int valorVinculacion) {
        this.valorVinculacion = valorVinculacion;
    }

    @Override
    public String toString() {
        return "Avanzada{" +
                "valorVinculacion=" + valorVinculacion +
                ", tieneVinculacion=" + tieneVinculacion +
                '}';
    }
}
