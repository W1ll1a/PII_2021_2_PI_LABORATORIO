package hn.edu.ujcv.pii.p2.Objetos;

public class Ingenieria extends General{
    private int notaProyecto;

    Ingenieria (){
        super();
    }
    Ingenieria (boolean todasCarreras , int id, String nombre,int unidadesValorativas,int NA1,int NA2,int NA3,
                int NR, int NE, int notaProyecto){
        super(todasCarreras,id,nombre, unidadesValorativas,NA1,NA2,NA3,NE,NR);
        this.notaProyecto= notaProyecto;
    }

    @Override
    public double calcularNotasFinal() {
        return super.calcularNotasFinal();
    }

    public int getNotaProyecto() {
        return notaProyecto;
    }

    public void setNotaProyecto(int notaProyecto) {
        this.notaProyecto = notaProyecto;
    }

    @Override
    public String toString() {
        return "Ingenieria{" +
                "notaProyecto=" + notaProyecto +
                '}';
    }
}
