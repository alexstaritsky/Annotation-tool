/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotation.tool;

//import
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class BestandLezen {

    private final JFileChooser openFileChooser;
    public String pad;
    private String header;
    private Object forwardSeq;
    private Object reverseSeq;
    private ArrayList<String> sequentie = new ArrayList<>();

    private JFileChooser fileChooser;
    private BufferedReader inFile;

    public BestandLezen() {
        openFileChooser = new JFileChooser();
    }

    public String bladerActionPerformed(java.awt.event.ActionEvent evt, GUI gui) {
        File selectedFile;
        int reply;
        fileChooser = new JFileChooser();
        reply = fileChooser.showOpenDialog(gui);
        if (reply == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            return selectedFile.getAbsolutePath();
        }
        return "";
    }

    public void OpenActionPerformed(java.awt.event.ActionEvent evt, String tekstbestand) throws IOException {
        try {
            String line;
            try (BufferedReader inFile = new BufferedReader(new FileReader(pad))) {
                while ((line = inFile.readLine()) != null) {
                    if (!line.startsWith("#")) {
                        String[] values = line.split("/t");

                    }
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Het bestand is niet gevonden");

        } catch (IOException ioe) {
            System.out.println("Het bestand kan niet gelezen worden");
        } catch (Exception e) {
            System.out.println("Onbekende fout: Raadpleeg een except!");
        }
    }

    public void Bestand(String bestand) throws IOException {
        try {
            BufferedReader inFile = new BufferedReader(new FileReader(bestand));
            String line;

            while ((line = inFile.readLine()) != null) {
                if (!line.startsWith("#")) {
                    String[] gen = line.split(">,/t");

                }
            }
        } catch (IOException ex) {
            throw ex;
        }
    }

    public ArrayList<String> FileReader(String pad) {
        String line;
        ArrayList<String> sequentie = new ArrayList<>();
        try {
            inFile = new BufferedReader(new FileReader(pad));

            while ((line = inFile.readLine()) != null) {
                if (line.contains("#")) {
                    header = line;

                } else {
                    sequentie.add(line);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Het geselecteerde bestand is niet gevonden", "Error Message", JOptionPane.ERROR_MESSAGE);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Er heeft zich een input/output error voorgedaan", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        return sequentie;

    }
}
