package expnode;

/**
 * The ConstantNode represents a single number value inside the tree.
 * Currently, it does nothing with its left and right leaves. Perhaps in the 
 * future, giving nodes that do nothing with their leaves will produce an error
 * Maybe. Perhaps.
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
