package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class listaAlumnos implements Iterable<Alumno> {
    private ArrayList<Alumno> listaDeAlumnos;

    public listaAlumnos(){
        this.listaDeAlumnos = new ArrayList<>();
    }
    public void addAlumno(Alumno alumno){
        listaDeAlumnos.add(alumno);
    }
    public void imprimirLista(){
        for (Alumno elementos : listaDeAlumnos
        ) {
            System.out.println("Nombre " + elementos.getNombre());
            System.out.println(" Id    " + elementos.getId());
            System.out.println("Cuenta " + elementos.getCuenta());
            System.out.println(" "       + elementos.getFechaDeNacimiento());

        }

    }

    @Override
    public Iterator<Alumno> iterator() {
        return listaDeAlumnos.iterator();
    }
}
