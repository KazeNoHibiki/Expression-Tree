/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expnode;

/**
 *
 * @author Howie
 */
public abstract class ExpNode {
     public ExpNode L = null;
     public ExpNode R = null;
     public double value = 0;
     
     public ExpNode(){
     }
     
     public ExpNode(ExpNode left, ExpNode right){
         this.L = left;
         this.R = right;
     }
     
     public abstract ExpNode calculateValue();
     
    @Override
     public abstract String toString();
}
