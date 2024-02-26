/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nezet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import modell.Asztal;
import modell.Etel;
import modell.Etterem;

/**
 *
 * @author somogyi.a.istvan
 */
public class EtteremGui extends javax.swing.JFrame {

    private Object mentes;
    private String rendeles;
    private Etterem etterem = new Etterem();
    private Etel etel;
    private List<Asztal> asztalok = etterem.getAsztalok();

    public EtteremGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etlapLista = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        rendelesLista = new javax.swing.JList<>();
        rendelesMentesGomb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        asztalValaszt = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        etelHozzaad = new javax.swing.JTextField();
        etelMentesGomb = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        etelLista = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        arHozzaad = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        kekAsztal = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pirosAsztal = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        kekAr = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        zoldAsztal = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        pirosAr = new javax.swing.JTextField();
        sargaAr = new javax.swing.JTextField();
        zoldAr = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        sargaAsztal = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        etlapFeltolt = new javax.swing.JMenuItem();
        etlapMegnyitas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        rendelesFeltolt = new javax.swing.JMenuItem();
        rendelesMegnyitas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Étel"));

        etlapLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(etlapLista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Rendelés"));

        jScrollPane4.setViewportView(rendelesLista);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        rendelesMentesGomb.setText("Mentés");
        rendelesMentesGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendelesMentesGombActionPerformed(evt);
            }
        });

        jLabel1.setText("Asztal:");

        asztalValaszt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Asztal kiválasztása --", "Kék asztal", "Piros asztal", "Zöld asztal", "Sárga asztal", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rendelesMentesGomb)
                        .addGap(169, 169, 169))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addGap(2, 2, 2)
                                .addComponent(asztalValaszt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(asztalValaszt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(rendelesMentesGomb)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Rendelés", jPanel1);

        jLabel2.setText("Étel:");

        etelMentesGomb.setText("Mentés");
        etelMentesGomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etelMentesGombActionPerformed(evt);
            }
        });

        etelLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(etelLista);

        jLabel7.setText("Ár:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(etelHozzaad, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(arHozzaad, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etelMentesGomb)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etelHozzaad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etelMentesGomb))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(arHozzaad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Étel", jPanel2);

        jLabel3.setText("Kék asztal");

        jLabel4.setText("Piros asztal");

        jScrollPane3.setViewportView(kekAsztal);

        jScrollPane2.setViewportView(pirosAsztal);

        jLabel5.setText("Zöld asztal");

        kekAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kekArActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(zoldAsztal);

        jLabel6.setText("Sárga asztal");

        pirosAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pirosArActionPerformed(evt);
            }
        });

        sargaAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sargaArActionPerformed(evt);
            }
        });

        zoldAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoldArActionPerformed(evt);
            }
        });

        jScrollPane8.setViewportView(sargaAsztal);

        jLabel8.setText("Összesen:");

        jLabel9.setText("Összesen:");

        jLabel10.setText("Összesen:");

        jLabel11.setText("Összesen:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kekAr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zoldAr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(pirosAr))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sargaAr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pirosAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kekAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sargaAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zoldAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Asztalok", jPanel5);

        jMenu1.setText("File");

        jMenu2.setText("Étlap");

        etlapFeltolt.setText("Mentés");
        etlapFeltolt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etlapFeltoltActionPerformed(evt);
            }
        });
        jMenu2.add(etlapFeltolt);

        etlapMegnyitas.setText("Megnyitás");
        etlapMegnyitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etlapMegnyitasActionPerformed(evt);
            }
        });
        jMenu2.add(etlapMegnyitas);

        jMenu1.add(jMenu2);

        jMenu3.setText("Rendelés");

        rendelesFeltolt.setText("Mentés");
        rendelesFeltolt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendelesFeltoltActionPerformed(evt);
            }
        });
        jMenu3.add(rendelesFeltolt);

        rendelesMegnyitas.setText("Megnyitás");
        rendelesMegnyitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendelesMegnyitasActionPerformed(evt);
            }
        });
        jMenu3.add(rendelesMegnyitas);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rendelesMentesGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendelesMentesGombActionPerformed
        Object jcItem = asztalValaszt.getSelectedItem();
        int jcIndex = asztalValaszt.getSelectedIndex();
        ListModel<String> lm = rendelesLista.getModel();
        DefaultListModel dlm = new DefaultListModel();
        for (int i = 0; i < lm.getSize(); i++) {
            dlm.add(i, lm.getElementAt(i));
        }
        String elem = etlapLista.getSelectedValue();
        if (jcIndex == 0 || elem == null) {
            JOptionPane.showMessageDialog(null, "Nem választottál asztalt vagy ételt!");
        } else {
            if (mentes != jcItem) {
                dlm.addElement(" -- " + jcItem + " -- ");
            }
            dlm.addElement(elem);
            rendeles = elem;
            rendelesLista.setModel(dlm);
            mentes = jcItem;
            etel = new Etel(elem, 500);
            asztalok(jcIndex);
        }


    }//GEN-LAST:event_rendelesMentesGombActionPerformed

    private void etelMentesGombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etelMentesGombActionPerformed

        DefaultListModel dlm = new DefaultListModel();
        ListModel<String> lm = etelLista.getModel();
        for (int i = 0; i < lm.getSize(); i++) {
            dlm.add(i, lm.getElementAt(i));
        }
        String ujEtel = etelHozzaad.getText();
        int ujAr = Integer.parseInt(arHozzaad.getText());
        if (ujEtel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nem adtál hozzá ételt vagy árat!");
        } else {
            dlm.addElement(String.format("%-10s %10s Ft", ujEtel, ujAr));
            etelLista.setModel(dlm);
            etlapLista.setModel(dlm);
        }

    }//GEN-LAST:event_etelMentesGombActionPerformed

    private void etlapFeltoltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etlapFeltoltActionPerformed
        Path path = Path.of("etlap.txt");
        ListModel<String> lm = etelLista.getModel();
        letolt(path, lm);
    }//GEN-LAST:event_etlapFeltoltActionPerformed

    private void letolt(Path path, ListModel<String> lm) {
        String str = "";
        for (int i = 0; i < lm.getSize(); i++) {
            str += lm.getElementAt(i) + "\n";
        }
        try {
            Files.deleteIfExists(path);
        } catch (IOException ex) {
            Logger.getLogger(EtteremGui.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Files.write(path, str.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(EtteremGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void etlapMegnyitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etlapMegnyitasActionPerformed
        try {
            etterem.etlapotFajlbolFeltolt();
            
        } catch (IOException ex) {
            Logger.getLogger(EtteremGui.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_etlapMegnyitasActionPerformed

    private void rendelesMegnyitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendelesMegnyitasActionPerformed
        Path path = Path.of("rendeles.txt");
        try {
            DefaultListModel dlm = letolt(path);
            rendelesLista.setModel(dlm);
        } catch (IOException ex) {
            Logger.getLogger(EtteremGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rendelesMegnyitasActionPerformed

    private void rendelesFeltoltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendelesFeltoltActionPerformed
        Path path = Path.of("rendeles.txt");
        ListModel<String> lm = rendelesLista.getModel();

        letolt(path, lm);
    }//GEN-LAST:event_rendelesFeltoltActionPerformed

    private void kekArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kekArActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kekArActionPerformed

    private void pirosArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirosArActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pirosArActionPerformed

    private void sargaArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sargaArActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sargaArActionPerformed

    private void zoldArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoldArActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zoldArActionPerformed

    private DefaultListModel letolt(Path path) throws IOException {
        List<String> sorok = Files.readAllLines(path);
        DefaultListModel dlm = new DefaultListModel();
        for (int i = 0; i < sorok.size(); i++) {
            dlm.addElement(sorok.get(i));
        }
        return dlm;
    }

    private void asztalok(int index) {
        DefaultListModel dlm = new DefaultListModel();
        dlm.addElement(rendeles);
        switch (index) {
            case 1:
                kekAsztal.setModel(dlm);
                for (Asztal asztal : asztalok) {
                    if (asztal.getSzin() == "Kek") {
                        asztal.ujRendeles(etel);
                    }
                }
                break;
            case 2:
                pirosAsztal.setModel(dlm);
                for (Asztal asztal : asztalok) {
                    if (asztal.getSzin() == "Piros") {
                        asztal.ujRendeles(etel);
                    }
                }
                break;
            case 3:
                zoldAsztal.setModel(dlm);
                for (Asztal asztal : asztalok) {
                    if (asztal.getSzin() == "Zold") {
                        asztal.ujRendeles(etel);
                        for (Etel etel : asztal.getRendelesek()) {
                            System.out.println(etel.getNev());
                        }
                    }
                }
                break;
            case 4:
                sargaAsztal.setModel(dlm);
                for (Asztal asztal : asztalok) {
                    if (asztal.getSzin() == "Sarga") {
                        asztal.ujRendeles(etel);
                    }
                }
                break;
            default:
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arHozzaad;
    private javax.swing.JComboBox<String> asztalValaszt;
    private javax.swing.JTextField etelHozzaad;
    private javax.swing.JList<String> etelLista;
    private javax.swing.JButton etelMentesGomb;
    private javax.swing.JMenuItem etlapFeltolt;
    private javax.swing.JList<String> etlapLista;
    private javax.swing.JMenuItem etlapMegnyitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kekAr;
    private javax.swing.JList<String> kekAsztal;
    private javax.swing.JTextField pirosAr;
    private javax.swing.JList<String> pirosAsztal;
    private javax.swing.JMenuItem rendelesFeltolt;
    private javax.swing.JList<String> rendelesLista;
    private javax.swing.JMenuItem rendelesMegnyitas;
    private javax.swing.JButton rendelesMentesGomb;
    private javax.swing.JTextField sargaAr;
    private javax.swing.JList<String> sargaAsztal;
    private javax.swing.JTextField zoldAr;
    private javax.swing.JList<String> zoldAsztal;
    // End of variables declaration//GEN-END:variables
}
