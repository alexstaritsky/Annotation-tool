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
    private int startPos;
    private int stopPos;
    
    public SequenceAnnotation( int startPos, int stopPos){
        this.startPos = startPos;
        this.stopPos = stopPos;
    }
    
    public int getstartPos(){
        return startPos;
    }
    
    public int getstopPos(){
        return stopPos;
    }
    
    @Override
    public String toString(){
        return Integer.toString(startPos) +", "+ Integer.toString(stopPos);
    }
}
