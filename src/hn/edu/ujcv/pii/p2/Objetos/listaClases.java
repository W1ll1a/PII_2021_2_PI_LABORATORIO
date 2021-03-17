package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class listaClases extends ArrayList<Clase> implements Iterable<Clase> {
    private ArrayList<Clase> listaDeClases ;

    public listaClases(){
        listaDeClases = new ArrayList<>();
    }
    public void addClase(Clase clase){
        listaDeClases.add(clase);
    }
    public void imprimirLista(){
        for(Clase elements :listaDeClases){
            System.out.println("Nombre de Clase "           + elements.getNombre());
            System.out.println("Id de Clase "               + elements.getId());
            System.out.println("Nota Acumulativo 1 "        +elements.getNotaAcumulativo1() );
            System.out.println("Nota Acumulativo 2 "        +elements.getNotaAcumulativo2());
            System.out.println("Nota Acumulativo 3 "        +elements.getNotaAcumulativo3());
            System.out.println("Nota examen "               +elements.getNotaExamen());
            System.out.println("Nota Recuperacion "         +elements.getNotarecuperacion());
            System.out.println("Unidades calorativas de la clase " + elements.getUnidadesValorativas());



        }
    }

    @Override
    public Iterator<Clase> iterator() {
        return listaDeClases.iterator();
    }
}
