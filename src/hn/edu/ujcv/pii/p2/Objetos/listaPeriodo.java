package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class listaPeriodo implements Iterable<Periodo> {
    ArrayList<Periodo> listaDePeriodos;

    public listaPeriodo(){
        this.listaDePeriodos = new ArrayList<>();
    }
    public void Addperiodo(Periodo periodo){
        listaDePeriodos.add(periodo);
    }
    public void imprimirLista(){
        for(Periodo elements : listaDePeriodos){
            System.out.println("Descripcion "           + elements.getDescripcion());
            System.out.println("Id del periodo "        + elements.getId());
            System.out.println("Fecha de inicio "       +elements.getFechaInicio());
            System.out.println("Fecha de Finalizacion"  +elements.getFechafin());
        }
    }

    @Override
    public Iterator<Periodo> iterator() {
        return listaDePeriodos.iterator();
    }
}
