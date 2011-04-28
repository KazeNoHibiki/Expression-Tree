package expnode;

/**
 * The ExpNode is the general super class for all nodes in an expression tree.
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
