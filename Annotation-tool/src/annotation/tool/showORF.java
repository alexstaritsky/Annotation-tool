/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotation.tool;

//import static annotation.tool.showProtein.showProtein;

import java.util.Arrays;


/**
 *
 * @author angga
 */
public class showORF {
    public static void main(String[]args){
        String sequence = "CCACACCACACCCACACACCCAUGCACACCACACCACACACCACACCACACCCACACACACACATCCTAACACTACCCTAACACAGCCCTTAA";
        
        //String AminoAcid = showProtein.translate(sequence);
        //System.out.println(AminoAcid);
        String codon;
        int currentStart=0;
        String START = "M";
        
        for(int i=0; i< (sequence.length())/3;i++){
            codon = sequence.substring(i*3,i*3+3);
            
            String aa = showProtein.translate(codon);
            System.out.println(codon+"-"+aa);
                
        }
        
    }
}
