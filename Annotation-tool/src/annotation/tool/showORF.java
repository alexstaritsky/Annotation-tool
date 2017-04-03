/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotation.tool;

import java.util.*;

/**
 *
 * @author angga
 */
public class showORF {
    
    public static void test(){
        
    }
    
    public static List<SequenceAnnotation> ORF (String sequence){
        
        //Arraylist voor ORFs
        List<SequenceAnnotation> orfs = new ArrayList<>();
        StringBuilder CDS = new StringBuilder();

        //Variabelen
        String codon;
        int currentStart = 0;
        String START = "M";
        String STOP = "*";
        boolean inORF = false;
        int startPos = 0;
        int stopPos = 0;

        int count = 0;

        //Loop door het DNA sequentie
        for (int i = 0; i < (sequence.length()) / 3; i++) {

            //Leest per 3 nucleotiden
            codon = sequence.substring(i * 3, i * 3 + 3);
            count += 3;

            String aa = showProtein.translate(codon);
            //Vind het startcodon en positie
            if (aa.equals(START) && !inORF) {
                inORF = true;
                startPos = new Integer(count);

            }
            //Vind het stopcodon en positie
            if (aa.equals(STOP) && inORF) {
                inORF = false;
                stopPos = new Integer(count);
                orfs.add(new SequenceAnnotation(startPos, stopPos));
            }

        }
        return orfs;
    }
}
