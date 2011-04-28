package expnode;

/**
 *
 * @author Howie
 */
public class ExpNodeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExpNode two = new ConstantNode(2);
        ExpNode four = new ConstantNode(4);
        ExpNode divide = new DivideNode(two, four);
        ExpNode three = new ConstantNode(3);
        ExpNode sum = new PlusNode(divide, three);
        ExpNode eight = new ConstantNode(8);
        ExpNode sum2 = new MinusNode(eight, sum);
        ExpNode total = new TimesNode(sum2, two);
        System.out.println(total.toString() + " = " + total.calculateValue().toString());
    }
}
