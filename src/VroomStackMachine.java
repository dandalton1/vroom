import java.util.ArrayList;

public class VroomStackMachine {
    public ArrayList<Character> stack = new ArrayList<Character>();
    public int stackPosition = 0;

    public VroomStackMachine() {
        push((char) 0);
    }

    public void push(Character c) {
        stack.add(c);
        stackPosition++;
    }

    public Character pop() throws VroomStackEmptyException {
        if (stack.isEmpty()) {
            throw new VroomStackEmptyException();
        }
        return stack.remove(--stackPosition);
    }

    public void printStack() {
        System.out.println();
        System.out.printf("STACK: ");
        if (!stack.isEmpty()) {
            for (Character c : stack) {
                System.out.printf("%d | ", (int) c.charValue());
            }
        } else {
            System.out.printf("EMPTY STACK");
        }
        System.out.println();
    }
}

class VroomStackEmptyException extends Exception {
    public VroomStackEmptyException() {
        super();
    }
}