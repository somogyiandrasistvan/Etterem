package modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import nezet.EtteremGui;
import nezet.Konzol;

public class Etterem {

    public static final String HUF = "Ft";
    private ArrayList<Asztal> asztalok = new ArrayList<>();
    private ArrayList<Etel> etlap = new ArrayList<>();

    public Etterem() {
        asztalok.add(new Asztal("Kek"));
        asztalok.add(new Asztal("Piros"));
        asztalok.add(new Asztal("Zold"));
        asztalok.add(new Asztal("Sarga"));
    }

    public List<Asztal> getAsztalok() {
        return Collections.unmodifiableList(asztalok);
    }

    public void etlapotFajlbolFeltolt() throws IOException {
        Path path = Path.of("etlap.txt");
        List<String> etelek = Files.readAllLines(path);
        for (String etel : etelek) {
            etlap.add(new Etel(etel));
        }
    }

    public void rendeleseketFajbolFeltolt() {
        Path path = Path.of("rendeles.txt");
    }

    private Etel etelKivalaszt(String etelNeve) {
        int i = 0;
        while (!(etlap.get(i).getNev().equals(etelNeve))) {
            i++;
        }
        return etlap.get(i);
    }

}
