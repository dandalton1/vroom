import java.util.Enumeration;
import java.util.Stack;

public class VroomStackMachine {
    public Stack<Character> stack = new Stack<Character>();

    public VroomStackMachine() {
        stack.push((char)0);
    }

    public void printStack() {
        System.out.println();
        Enumeration<Character> elements = stack.elements();
        System.out.println("STACK: ");
        while (elements.hasMoreElements()) {
            System.out.print(((int)elements.nextElement().charValue()) + " | ");
        }
        System.out.println();
    }
}