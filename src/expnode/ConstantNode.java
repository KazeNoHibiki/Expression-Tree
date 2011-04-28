/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expnode;

/**
 *
 * @author Howie
 */
public class ConstantNode extends ExpNode{
    
    public ConstantNode(ExpNode left, ExpNode right){
        super(left, right);
    }
    
    public ConstantNode(double value){
        this.value = value;
    }
    
    public ConstantNode(ConstantNode cloneNode){
        this.value = cloneNode.value;
    }
    
    
    @Override
    public ExpNode calculateValue(){
        return this;
    }
    
    @Override
    public String toString(){
        return "" + value;
    }
    
}
