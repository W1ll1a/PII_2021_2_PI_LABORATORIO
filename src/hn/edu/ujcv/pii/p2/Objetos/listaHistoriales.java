package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class listaHistoriales {
    private ArrayList<Historial> listaHistorial;

    listaHistoriales(){

    }
    private double calcularPromedioGlobal(){
        return 0;
    }
    public void addHistorial(Historial historial){
        listaHistorial.add(historial);
    }
    private void imprimirLista(){
        System.out.println(listaHistorial);
    }
}
