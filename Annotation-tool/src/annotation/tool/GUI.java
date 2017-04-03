/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotation.tool;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class GUI extends javax.swing.JFrame {

    private DatabaseConnection dbcon;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        bestandnaam = new javax.swing.JTextField();
        blader = new javax.swing.JButton();
        Open = new javax.swing.JButton();
        kiesdb = new javax.swing.JButton();
        orfbutton = new javax.swing.JButton();
        visualisatie = new javax.swing.JPanel();
        BLASTparameters = new javax.swing.JLabel();
        blastbutton = new javax.swing.JButton();
        typeblast = new javax.swing.JLabel();
        typeblastcombo = new javax.swing.JComboBox();
        algoritme = new javax.swing.JLabel();
        algoritmecombo = new javax.swing.JComboBox();
        low_complexity = new javax.swing.JCheckBox();
        matrixcombo = new javax.swing.JComboBox();
        matrix = new javax.swing.JLabel();
        mask_lookup = new javax.swing.JCheckBox();
        matchscore = new javax.swing.JLabel();
        mismatchscore = new javax.swing.JLabel();
        gapcostscore = new javax.swing.JLabel();
        match = new javax.swing.JTextField();
        mismatch = new javax.swing.JTextField();
        gap = new javax.swing.JTextField();
        databasetekst = new javax.swing.JLabel();
        compostialadjustmentstekst = new javax.swing.JLabel();
        compadjcombo = new javax.swing.JComboBox();
        exporteerresultaten = new javax.swing.JLabel();
        opslaanals = new javax.swing.JButton();
        typebestand = new javax.swing.JComboBox();
        opslaan = new javax.swing.JButton();
        visualisatietekst = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        host = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        port = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        verbindingbutton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        blader.setText("Blader...");
        blader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bladerActionPerformed(evt);
            }
        });

        Open.setText("Open");
        Open.setEnabled(false);
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });

        kiesdb.setText("Upload naar Database");
        kiesdb.setEnabled(false);
        kiesdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiesdbActionPerformed(evt);
            }
        });

        orfbutton.setText("Voorspel ORF's");
        orfbutton.setEnabled(false);
        orfbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orfbuttonActionPerformed(evt);
            }
        });

        visualisatie.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout visualisatieLayout = new javax.swing.GroupLayout(visualisatie);
        visualisatie.setLayout(visualisatieLayout);
        visualisatieLayout.setHorizontalGroup(
            visualisatieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        visualisatieLayout.setVerticalGroup(
            visualisatieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        BLASTparameters.setText("BLAST parameters:");

        blastbutton.setText("BLAST");
        blastbutton.setEnabled(false);
        blastbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blastbuttonActionPerformed(evt);
            }
        });

        typeblast.setText("Type BLAST:");

        typeblastcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "blastn"}));
        typeblastcombo.setEnabled(false);

        algoritme.setText("Algoritme:");

        algoritmecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "standaard"}));
        algoritmecombo.setEnabled(false);

        low_complexity.setText("Low Complexity");
        low_complexity.setEnabled(false);

        matrixcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Standaard"}));
        matrixcombo.setEnabled(false);

        matrix.setText("Matrix:");

        mask_lookup.setText("Mask Lookup");
        mask_lookup.setEnabled(false);

        matchscore.setText("Match score:");

        mismatchscore.setText("Mismatch score:");

        gapcostscore.setText("gap costs:");

        match.setEnabled(false);

        mismatch.setEnabled(false);

        gap.setEnabled(false);

        databasetekst.setText("Database:");

        compostialadjustmentstekst.setText("Compositial adjustments");

        compadjcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Standaard" }));
        compadjcombo.setEnabled(false);

        exporteerresultaten.setText("Exporteer resultaten: ");

        opslaanals.setText("Opslaan als...");
        opslaanals.setEnabled(false);
        opslaanals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opslaanalsActionPerformed(evt);
            }
        });

        typebestand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".FASTA", ".txt" }));
        typebestand.setEnabled(false);

        opslaan.setText("Opslaan");
        opslaan.setEnabled(false);

        visualisatietekst.setText("Visualisatie:");

        jLabel1.setText("Host");

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        jLabel4.setText("Port:");

        host.setText("cytosine.nl");

        user.setText("owe7_pg6");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        port.setText("1521");
        port.setToolTipText("");

        verbinding.setText("Check verbinding");
        verbinding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verbindingActionPerformed(evt);
            }
        });

        password.setText("blaat1234");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        verbindingbutton.setText("Test verbinding");
        verbindingbutton.setEnabled(false);
        verbindingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verbindingbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bestandnaam, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(blader, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(orfbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(visualisatie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(low_complexity)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(compadjcombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BLASTparameters)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(typeblast)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(typeblastcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(matchscore)
                                            .addComponent(match, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mismatchscore)
                                            .addComponent(mismatch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(gapcostscore)
                                            .addComponent(gap, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(blastbutton)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(algoritme)
                                                .addComponent(matrix))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(algoritmecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(matrixcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(compostialadjustmentstekst)))
                            .addComponent(mask_lookup)
                            .addComponent(visualisatietekst))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typebestand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(exporteerresultaten)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(databasetekst)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(host)
                                    .addComponent(user)
                                    .addComponent(port)
                                    .addComponent(password)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(opslaan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(opslaanals))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(kiesdb)))))))
                                .addComponent(opslaan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opslaanals))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(verbindingbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(kiesdb)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bestandnaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blader)
                    .addComponent(Open))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orfbutton)
                .addGap(5, 5, 5)
                .addComponent(visualisatietekst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualisatie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exporteerresultaten)
                    .addComponent(BLASTparameters))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeblast, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeblastcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typebestand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(algoritme)
                    .addComponent(algoritmecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opslaanals)
                    .addComponent(opslaan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matrixcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(databasetekst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(compostialadjustmentstekst)
                        .addGap(13, 13, 13)
                        .addComponent(compadjcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(low_complexity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mask_lookup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matchscore)
                            .addComponent(mismatchscore)
                            .addComponent(gapcostscore))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(match, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mismatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kiesdb)
                            .addComponent(verbindingbutton))))
                .addGap(18, 18, 18)
                .addComponent(blastbutton)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bladerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bladerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bladerActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenActionPerformed

    private void orfbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orfbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orfbuttonActionPerformed

    private void kiesdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiesdbActionPerformed
        // TODO add your handling code here:
        String Host = host.getText();
        String Username = user.getText();
        String Password = password.getText();
        int Port = 1521;
        try {
            Port = Integer.parseInt(port.getText());
            dbcon = new DatabaseConnection(Host, Username, Password, Port);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "De port bevat geen getal");
        }

    }//GEN-LAST:event_kiesdbActionPerformed

    private void blastbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blastbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blastbuttonActionPerformed

    private void opslaanalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opslaanalsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opslaanalsActionPerformed

    private void verbindingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verbindingActionPerformed
        // TODO add your handling code here:
        String Host = host.getText();
        String Username = user.getText();
        String Password = password.getText();
        int Port = 1521;
        try {
            Port = Integer.parseInt(port.getText());
            dbcon = new DatabaseConnection(Host, Username, Password, Port);
            if (DatabaseConnection.checkJDBCDriver() == true) {
                if (dbcon.testConnection() == true) {
                    kiesdb.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Er kon geen connectie gemaakt worden met de database.");

                }
            } else {
                JOptionPane.showMessageDialog(null, "JDBC is niet (goed) geïnstalleerd.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "De port bevat geen getal");
        }
    }//GEN-LAST:event_verbindingActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed
  
    private void verbindingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verbindingbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verbindingbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BLASTparameters;
    private javax.swing.JButton Open;
    private javax.swing.JLabel algoritme;
    private javax.swing.JComboBox algoritmecombo;
    private javax.swing.JTextField bestandnaam;
    private javax.swing.JButton blader;
    private javax.swing.JButton blastbutton;
    private javax.swing.JComboBox compadjcombo;
    private javax.swing.JLabel compostialadjustmentstekst;
    private javax.swing.JLabel databasetekst;
    private javax.swing.JLabel exporteerresultaten;
    private javax.swing.JTextField gap;
    private javax.swing.JLabel gapcostscore;
    private javax.swing.JTextField host;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton kiesdb;
    private javax.swing.JCheckBox low_complexity;
    private javax.swing.JCheckBox mask_lookup;
    private javax.swing.JTextField match;
    private javax.swing.JLabel matchscore;
    private javax.swing.JLabel matrix;
    private javax.swing.JComboBox matrixcombo;
    private javax.swing.JTextField mismatch;
    private javax.swing.JLabel mismatchscore;
    private javax.swing.JButton opslaan;
    private javax.swing.JButton opslaanals;
    private javax.swing.JButton orfbutton;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField port;
    private javax.swing.JComboBox typebestand;
    private javax.swing.JLabel typeblast;
    private javax.swing.JComboBox typeblastcombo;
    private javax.swing.JTextField user;
    private javax.swing.JButton verbinding;
    private javax.swing.JButton verbindingbutton;
    private javax.swing.JPanel visualisatie;
    private javax.swing.JLabel visualisatietekst;
    // End of variables declaration//GEN-END:variables
}
