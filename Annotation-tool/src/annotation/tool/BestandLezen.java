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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class BestandLezen extends javax.swing.JFrame {

    private final JFileChooser openFileChooser;
    public String pad;
    private String header;
    private Object forwardSeq;
    private Object reverseSeq;
    private ArrayList<String> sequentie = new ArrayList<>();

    private JFileChooser fileChooser;
    private BufferedReader inFile;

    public BestandLezen() {
        initComponents();
        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("C:/Users/Administrator/Desktop/bases_100.txt"));
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String args[]) throws FileNotFoundException, IOException {
        BufferedReader bufRead = new BufferedReader(new FileReader("bases_100.txt"));
        {
            String myLine = null;
            if (myLine.startsWith(">")) {
                String[] sequentieInfo = myLine.substring(1).split(" ");

                while (((myLine = bufRead.readLine()) != null) && !myLine.startsWith(">")) {
                    System.out.println("myLine");
                }
            }
        }
    }

    private void bladerActionPerformed(java.awt.event.ActionEvent evt) {
        File selectedFile;
        int reply;
        Object blader = null;
        if (evt.getSource() == blader) {
            fileChooser = new JFileChooser();
            reply = fileChooser.showOpenDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                bestand.setText(selectedFile.getAbsolutePath());
            }
        }
    }

    public void OpenActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        String tekstbestand = bestand.getText();
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
            Logger.getLogger (bestandlezen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public ArrayList<String> FileReader(String pad) throws FileNotFoundException {
    String line;
    ArrayList<String> sequentie = new ArrayList<>();
    try {
        inFile = new BufferedReader(new FileReader(pad));
        
        while ((line =inFile.readLine()) !=null) {
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