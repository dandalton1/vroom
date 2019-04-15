import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class VroomParser {
    public Scanner VroomFile = null;
    public VroomStackMachine stackMachine = new VroomStackMachine();

    public VroomParser(String inFile) throws FileNotFoundException {
        VroomFile = new Scanner(new File(inFile));
    }

    public void parse() throws VroomStackEmptyException {
        boolean shouldParse = true;
        int honksToIgnore = 0;

        while (VroomFile.hasNext() && shouldParse) {
            String s = VroomFile.next().toUpperCase();
            switch (s) {
            case "BUM": {
                stackMachine.pop();
                break;
            }
            case "BRUM": {
                stackMachine.push((char) (stackMachine.pop().charValue() + 1));
                break;
            }
            case "CLUNK": {
                stackMachine.push((char) (stackMachine.pop().charValue() - 1));
                break;
            }
            case "VROOM": {
                System.out.printf("%c", stackMachine.pop());
                break;
            }
            case "NYEUM": {
                System.out.printf("%d", (int) stackMachine.pop().charValue());
                break;
            }
            case "CLIK": {
                stackMachine.push('\0');
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
            case "HONK": {
                if (stackMachine.peek().charValue() != 0 && honksToIgnore == 0) {
                    String buffer = "";
                    try {
                        do {
                            buffer = VroomFile.next().toUpperCase();
                        } while (!buffer.equals("HONK"));
                    } catch (NoSuchElementException n) {
                        System.out.println("ERROR - NO END OF HONK");
                    }
                } else if (honksToIgnore > 0) {
                    honksToIgnore--;
                } else {
                    honksToIgnore++;
                }
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