/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expnode;

/**
 *
 * @author Howie
 */
public class MinusNode extends ExpNode{
    
    public MinusNode(ExpNode left, ExpNode right){
        super(left, right);
    }
    
    @Override
    public ExpNode calculateValue() {
        if(L != null && R != null){
            return new ConstantNode(L.calculateValue().value - R.calculateValue().value);
        }
        return null;
    }

    @Override
    public String toString() {
        if(L != null && R != null){
            return "(" + L.toString() + ") - (" + R.toString() + ")";
        }
        return "";
    }
    
}
