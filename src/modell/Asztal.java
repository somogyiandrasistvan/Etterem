package modell;

import java.util.ArrayList;
import java.util.List;

public class Asztal {

    private String szin;
    private ArrayList<Etel> rendelesek = new ArrayList<>();
    
    public Asztal(String szin) {
        this.szin = szin;
    }
    
    public String getSzin() {
        return szin;
    }
    
    public void ujRendeles(Etel etel){
        rendelesek.add(etel);
    }
    
    public List<Etel> getRendelesek() {
        return rendelesek;
    }
    
    public int getOsszAr(){
        return 0;
    }
    
}
