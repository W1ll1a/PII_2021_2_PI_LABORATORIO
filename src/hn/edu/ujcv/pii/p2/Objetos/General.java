package hn.edu.ujcv.pii.p2.Objetos;

public class General extends Clase{
    private boolean todasCarreras;
   General(){
       super();
   }

    General(boolean TodasCarreras, int id, String nombre, int unidadesValorativas ,  int NA1,int NA2,int NA3, int NE, int NR){
        super(id,NE,unidadesValorativas,NA1,NA2, NA3, nombre,NR);
        this.todasCarreras = TodasCarreras;
    }
    public boolean isTodasCarreras(){
        return true;
    }

    public void setTodasCarreras(boolean todasCarreras) {
        this.todasCarreras = todasCarreras;
    }

    @Override
    public String toString() {
        return "General{" +
                "todasCarreras=" + todasCarreras +
                '}';
    }

}
