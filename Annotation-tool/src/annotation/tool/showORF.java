/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotation.tool;

//import static annotation.tool.showProtein.showProtein;

/**
 *
 * @author angga
 */
public class showORF {
    public static void main(String[]args){
        String sequence = "CCACACCACACCCACACACCCAUGsCACACCACACCACACACCACACCACACCCACACACACACATCCTAACACTACCCTAACACAGCCCTAA\n" +
                            "TCTAACCCTGGCCAACCTGTCTCTCAACTTACCCTCCATTACCCTGCCTCCACTCGTTACCCTGTCCCATTCAACCATACCACTCCGAAC\n" +
                            "CACCATCCATCCCTCTACTTACTACCACTCACCCACCGTTACCCTCCAATTACCCATATCCAACCCACTGCCACTTACCCTACCATTACC\n" +
                            "CTACCATCCACCATGACCTACTCACCATACTGTTCTTCTACCCACCATATTGAAACGCTAACAAATGATCGTAAATAACACACACGTGCT\n" +
                            "TACCCTACCACTTTATACCACCACCACATGCCATACTCACCCTCACTTGTATACTGATTTTACGTACGCACACGGATGCTACAGTATATA\n" +
                            "CCATCTCAAACTTACCCTACTCTCAGATTCCACTTCACTCCATGGCCCATCTCTCACTGAATCAGTACCAAATGCACTCACATCATTATG\n" +
                            "CACGGCACTTGCCTCAGCGGTCTATACCCTGTGCCATTTACCCATAACGCCCATCATTATCCACATTTTGATATCTATATCTCATTCGGC\n" +
                            "GGTCCCAAATATTGTATAACTGCCCTTAATACATACGTTATACCACTTTTGCACCATATACTTACCACTCCATTTATATACACTTATGTC\n" +
                            "AATATTACAGAAAAATCCCCACAAAAATCACCTAAACATAAAAATATTCTACTTTTCAACAATAATACATAAACATATTGGCTTGTGGTA\n" +
                            "GCAACACTATCATGGTATCACTAACGTAAAAGTTCCTCAATATTGCAATTTGCTTGAACGGATGCTATTTCAGAATATTTCGTACTTACA\n" +
                            "CAGGCCATACATTAGAATAATATGTCACATCACTGTCGTAACACTCTTTATTCACCGAGCAATAATACGGTAGTGGCTCAAACTCATGCG";
        
        String AminoAcid = showProtein.translate(sequence);
        //System.out.println(AminoAcid);
        
        //read in data
        String start = args[0];
        String stop = args[1];
        String genome = sequence;
        
        // find codon
        int beg = -1;
        for (int i = 0; i < genome.length() - 2; i++) {
            String codon = genome.substring(i, i+3);
            
            // Start codon
            if (codon.equals(start)) beg = i;
            
            // Stop codon
            if ((codon.equals(stop)) && (beg != -1) && (beg + 3 < i)) {
                String gene = genome.substring(beg+3, i);
                if (gene.length()% 3 == 0) {
                    System.out.println(gene);
                    beg = -1;
                }
            }
        }
    }
}
