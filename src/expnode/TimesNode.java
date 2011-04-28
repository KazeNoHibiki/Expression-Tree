package expnode;

/**
 * The TimesNode calculates its value as the product of its left and right
 * leaves.
 * 
 * @author Howie
 */
public class TimesNode extends ExpNode{

    public TimesNode(ExpNode left, ExpNode right){
        super(left, right);
    }
    
    @Override
    public ExpNode calculateValue() {
        if(L != null && R != null){
            return new ConstantNode(L.calculateValue().value * R.calculateValue().value);
        }
        return null;
    }

    @Override
    public String toString() {
        if(L != null && R != null){
            return "(" + L.toString() + ") * (" + R.toString() + ")";
        }
        return "";
    }
    
}
