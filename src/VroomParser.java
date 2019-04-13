import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class VroomParser {
    public Scanner VroomFile = null;
    public VroomStackMachine stackMachine = new VroomStackMachine();

    public VroomParser(String inFile) throws FileNotFoundException {
        VroomFile = new Scanner(new File(inFile));
    }

    public void parse() {
        boolean shouldParse = true;

        while (VroomFile.hasNext() && shouldParse) {
            String s = VroomFile.next().toUpperCase();
            switch (s) {
                case "BUM": {
                    stackMachine.stack.pop();
                    break;
                }
                case "BRUM": {
                    char c = stackMachine.stack.pop().charValue();
                    c++;
                    stackMachine.stack.push(c);
                    break;
                }
                case "CLUNK": {
                    char c = stackMachine.stack.pop().charValue();
                    c--;
                    stackMachine.stack.push(c);
                    break;
                }
                case "VROOM": {
                    System.out.printf("%c", stackMachine.stack.pop().charValue());
                    break;
                }
                case "NYEUM": {
                    System.out.printf("%d", (int) stackMachine.stack.pop().charValue());
                    break;
                }
                case "CLIK": {
                    stackMachine.stack.push((char) 0);
                    break;
                }
                case "BEEP": {
                    stackMachine.stack.push((char) (stackMachine.stack.pop() + stackMachine.stack.pop()));
                    break;
                }
                case "ZOOM": {
                    stackMachine.stack.push((char) (new Scanner(System.in)).nextInt());
                    break;
                }
                case "SKRT": {
                    shouldParse = false;
                    break;
                }
                default: {
                    System.out.println("ERROR: INVALID CAR NOISE " + s);
                    break;
                }
            }
        
            if (vroom.showStack) {
                stackMachine.printStack();
            }
        }
        
        if (shouldParse) {
            System.out.println("CARS SHOULD END WITH SKRT");
        }
    }
}