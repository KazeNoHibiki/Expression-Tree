/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
        ConstantNode two = new ConstantNode(2);
        ConstantNode three = new ConstantNode(3);
        ExpNode sum = new MinusNode(two, three);
        System.out.println(sum.toString() + " = " + sum.calculateValue().toString());
    }
}
