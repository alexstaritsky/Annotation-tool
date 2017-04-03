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
    public static void main(String[]args){
        //Test sequentie
        String sequence = "CCACACCACACCCACACACCCAUGCACACCACACCACACACCACACCACACCCACACACACACATCCTAACACTACCCTAACACAGCCCTTAA";

        //Arraylist voor ORFs
        List orfs = new ArrayList();
        
        //Variabelen
        String codon;
        int currentStart=0;
        String START = "M";
        String STOP = "*";
        boolean inORF = false;
        
        //Loop door het DNA sequentie
        for(int i=0; i< (sequence.length())/3;i++){
            
            //Leest per 3 nucleotiden
            codon = sequence.substring(i*3,i*3+3);
            
            String aa = showProtein.translate(codon);
                if (aa.equals(START) && inORF==false){
                    inORF = true;
                }
                if (aa.equals(STOP) && inORF==true){
                    inORF = false;
                }
                System.out.println(codon+" "+aa+" "+inORF);
            }
    }
}
