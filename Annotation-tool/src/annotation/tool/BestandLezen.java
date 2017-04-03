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
 * deze class is geschreven om de gekozen bestanden te verwerken.
 *
 * @author Administrator
 */
public class BestandLezen {

    private final JFileChooser openFileChooser;
    public String pad;
    private ArrayList<Sequentie> sequentie = new ArrayList<>();

    private JFileChooser fileChooser;
    private BufferedReader inFile;

    public BestandLezen() {
        openFileChooser = new JFileChooser();
    }

    /**
     * *
     * Deze functie haalt een bestand op wanneer er op 'blader' geklikt wordt en
     * het bestand gekozen wordt. Vervolgens zet hij deze in de pad. Er zijn
     * verschillende catches gebruikt om de gebuiker op weg te helpen als er
     * geen bestand is of gevonden kan worden.
     *
     * @param evt
     * @param gui de button 'blader' staat in de GUI
     * @return het geselcteerde bestand komt in het pad te staan.
     *
     */
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

    /**
     * *
     * Deze functie maakt een ArrayList aan om de verschillende sequenties in de
     * List te zetten. Er zijn verschillende catches gebruikt om de gebuiker op
     * weg te helpen als er geen bestand is of gevonden kan worden.
     *
     * @param pad. Dit is het geselecteerde pad
     * @return retuneerd elke regel van het bestand die in het pad geselecteerd
     * is. Alleen de header wordt niet meegenomen.
     */
    public ArrayList<Sequentie> FileReader(String pad) {
        String line, cleanLine;
        String header = null;
        StringBuilder sequentie = new StringBuilder();
        ArrayList<Sequentie> sequenties = new ArrayList<>();
        try {
            inFile = new BufferedReader(new FileReader(pad));
            while ((line = inFile.readLine()) != null) {
                if (line.startsWith(">")) {
                    if (header == null) {
                        header = line;
                    } else {
                        sequenties.add(new Sequentie(0, header, sequentie.toString()));
                        sequentie = new StringBuilder();
                        header = line;
                    }
                } else if (!(cleanLine = line.toUpperCase().replace("", "").replace("", "").replace("", "")).equals("")) {
                    sequentie.append(cleanLine);
                }
            }
            sequenties.add(new Sequentie(0, header, sequentie.toString()));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Het geselecteerde bestand is niet gevonden", "Error Message", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Er heeft zich een input/output error voorgedaan", "Error Message", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println("Onbekende fout: Raadpleeg een expert!");
        }
        return sequenties;
    }
}
