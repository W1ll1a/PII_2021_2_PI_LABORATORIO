package hn.edu.ujcv.pii.p2.Objetos;

public class Idioma extends General{
    private int notaLaboratorio;

    Idioma(boolean todasCarreras, int id, int NE,String nombre, int unidadesValorativas, int NR,
           int NA1,int NA2,int NA3, int notaLaboratorio){
        super(todasCarreras,id,nombre,unidadesValorativas,NA1,NA2,NA3,NE,NR);
        this.notaLaboratorio = notaLaboratorio;
    }

    @Override
    public double calcularNotasFinal() {
        return super.calcularNotasFinal();
    }

    public void setNotaLaboratorio(int notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }

    public int getNotaLaboratorio() {
        return notaLaboratorio;
    }

    @Override
    public String toString() {
        return "Idioma{" +
                "notaLaboratorio=" + notaLaboratorio +
                '}';
    }
}
