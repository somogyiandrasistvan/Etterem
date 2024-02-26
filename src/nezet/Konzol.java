package nezet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Asztal;
import modell.Etel;
import modell.Etterem;

public class Konzol {

    private Etterem etterem;

    public Konzol() throws IOException {
        try {
            etterem.etlapotFajlbolFeltolt();

        } catch (IOException ex) {
            Logger.getLogger(EtteremGui.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Asztal asztal : etterem.getAsztalok()) {
            System.out.println(asztal);
            for (Etel etel : asztal.getRendelesek()) {
                System.out.println(etel.getNev() + " " + etel.getAr());
            }
        }
    }

}
