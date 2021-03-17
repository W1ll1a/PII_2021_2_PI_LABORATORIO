package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class listaCampus implements Iterable<Campus> {
    private ArrayList<Campus> campusList;

    public listaCampus(){
        this.campusList = new ArrayList<>();
    }
    public void addCampus(Campus campus){
        campusList.add(campus);
    }
    public void imprimirLista(){
        for(Campus elements : campusList){
            System.out.println("Nombre de Campus "           + elements.getNombre());
            System.out.println("Id de Campus "               + elements.getId());
            System.out.println("Direccion de Catedratico"    + elements.getDireccion());
            System.out.println("Fecha de inicio del campus " + elements.getFechaDeInicio());

        }
    }


    @Override
    public Iterator<Campus> iterator() {
        return campusList.iterator();
    }
}
