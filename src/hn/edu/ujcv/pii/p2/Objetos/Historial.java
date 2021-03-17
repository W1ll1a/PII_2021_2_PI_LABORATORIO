package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class Historial implements IHistorial{
    private Alumno alumno;
    private Campus campus;
    private Carrera carrera;
    private Periodo periodo;
    private ArrayList<Clase > clase;

    public Historial(){

    }
    Historial (Alumno alumno, Campus campus, Carrera carrera, Periodo periodo,ArrayList<Clase> clase){
        this.alumno = alumno;
        this.campus = campus;
        this.carrera = carrera;
        this.periodo = periodo;
        this.clase = clase;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Clase> getClase() {
        return clase;
    }

    public void setClase(ArrayList<Clase> clase) {
        this.clase = clase;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    @Override
    public double calcularPromedio() {
        return 0;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "alumno=" + alumno +
                ", campus=" + campus +
                ", carrera=" + carrera +
                ", periodo=" + periodo +
                ", clase=" + clase +
                '}';
    }
}
