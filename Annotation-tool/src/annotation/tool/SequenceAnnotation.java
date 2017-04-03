/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotation.tool;

/**
 *
 * @author Angga Sondang
 */
public class SequenceAnnotation {
    private String cds;
    
    public SequenceAnnotation(String cds){
        this.cds = cds;
    }
    
    /**
     * @return cds
     */
    public String getcds(){
        return cds;
    }
    
    @Override
    public String toString(){
        return cds;
    }
}
