package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class listaCatedratico implements Iterable<Catedratico>{
    private ArrayList<Catedratico> catedraticList;

    public listaCatedratico(){
        this.catedraticList = new ArrayList<>();

    }
    public void addCatedratico(Catedratico catedratico){
        catedraticList.add(catedratico);
    }
    public void imprimirLista(){
        for(Catedratico elements : catedraticList){
            System.out.println("Nombre de catedratico "              + elements.getNombre());
            System.out.println("Id de catedratico "                  + elements.getId());
            System.out.println("Codigo de Catedratico "              + elements.getCodigo());
            System.out.println("Fceha de nacimiento del atedratico " + elements.getFechaDeNacimiento());

        }

    }

    @Override
    public Iterator<Catedratico> iterator() {
        return catedraticList.iterator();
    }
}
