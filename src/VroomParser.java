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
                    stackMachine.pop();
                    break;
                }
                case "BRUM": {
                    char c = stackMachine.pop().charValue();
                    c++;
                    stackMachine.push(c);
                    break;
                }
                case "CLUNK": {
                    char c = stackMachine.pop().charValue();
                    c--;
                    stackMachine.push(c);
                    break;
                }
                case "VROOM": {
                    System.out.printf("%c", stackMachine.pop().charValue());
                    break;
                }
                case "NYEUM": {
                    System.out.printf("%d", (int) stackMachine.pop().charValue());
                    break;
                }
                case "CLIK": {
                    stackMachine.push((char) 0);
                    break;
                }
                case "BEEP": {
                    stackMachine.push((char) (stackMachine.pop() + stackMachine.pop()));
                    break;
                }
                case "ZOOM": {
                    stackMachine.push((char) (new Scanner(System.in)).nextInt());
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