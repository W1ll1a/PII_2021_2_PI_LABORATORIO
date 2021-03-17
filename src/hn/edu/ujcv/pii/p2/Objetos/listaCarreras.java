package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class listaCarreras implements Iterable<Carrera> {
    private ArrayList<Carrera> listaDeCarreras;

    public listaCarreras(){
        listaDeCarreras =  new ArrayList<>();
    }
    public void addCarrera(Carrera carrera){
        listaDeCarreras.add(carrera);
    }
    public void imprimirLista(){
        for(Carrera elements : listaDeCarreras){
            System.out.println("Nombre de Carrera "           + elements.getNombre());
            System.out.println("Id de Carrera "               + elements.getId());
        }
    }

    @Override
    public Iterator<Carrera> iterator() {
        return listaDeCarreras.iterator();
    }
}
