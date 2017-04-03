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
    private int startPos;
    private int stopPos;
    
    public SequenceAnnotation(String cds){
        this.cds = cds;
        this.startPos = startPos;
        this.stopPos = stopPos;
    }
    
    /**
     * @return cds
     */
    public String getcds(){
        return cds;
    }
    
    public int getstartPos(){
        return startPos;
    }
    
    public int getstopPos(){
        return stopPos;
    }
    
    @Override
    public String toString(){
        return cds;
    }
}
