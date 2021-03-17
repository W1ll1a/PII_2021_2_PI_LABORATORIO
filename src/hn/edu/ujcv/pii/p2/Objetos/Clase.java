package hn.edu.ujcv.pii.p2.Objetos;

public class Clase implements IClase {
    private int id;
    private int NotaAcumulativo1;
    private int notaAcumulativo2;
    private int notaAcumulativo3;
    private int notaExamen;
    private int notarecuperacion;
    private int unidadesValorativas;
    private String nombre;

    public Clase(int id, int NA1 , int NA2, int NA3, int NE,int NR, String nombre, int unidadesValorativas){
        this.id = id;
        this.nombre = nombre;
        this.unidadesValorativas = unidadesValorativas;
        this.notaAcumulativo2 =NA2;
        this.notarecuperacion = NR;
        this.notaExamen = NE;
        this.NotaAcumulativo1 = NA1;
        this.notaAcumulativo3 = NA3;
    }
    public Clase(){

    }




    public void setNotaAcumulativo1(int notaAcumulativo1) {
        NotaAcumulativo1 = notaAcumulativo1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidadesValorativas() {
        return unidadesValorativas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadesValorativas(int unidadesValorativas) {
        this.unidadesValorativas = unidadesValorativas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNotarecuperacion(int notarecuperacion) {
        this.notarecuperacion = notarecuperacion;
    }


    public void setNotaAcumulativo2(int notaAcumulativo2) {
        this.notaAcumulativo2 = notaAcumulativo2;
    }

    public void setNotaAcumulativo3(int notaAcumulativo3) {
        this.notaAcumulativo3 = notaAcumulativo3;
    }

    public void setNotaExamen(int notaExamen) {
        this.notaExamen = notaExamen;
    }

    public int getNotaAcumulativo1() {
        return NotaAcumulativo1;
    }

    public int getId() {
        return id;
    }

    public int getNotaAcumulativo2() {
        return notaAcumulativo2;
    }

    public int getNotaAcumulativo3() {
        return notaAcumulativo3;
    }

    public int getNotaExamen() {
        return notaExamen;
    }

    public int getNotarecuperacion() {
        return notarecuperacion;
    }
    @Override
    public String toString() {
        return "Clase{" +
                "id=" + id +
                ", NotaAcumulativo1=" + NotaAcumulativo1 +
                ", notaAcumulativo2=" + notaAcumulativo2 +
                ", notaAcumulativo3=" + notaAcumulativo3 +
                ", notaExamen=" + notaExamen +
                ", notarecuperacion=" + notarecuperacion +
                ", unidadesValorativas=" + unidadesValorativas +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    @Override
    public double calcularNotasFinal() {
        return 0;
    }
}
