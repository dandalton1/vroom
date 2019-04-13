import java.util.Scanner;
import java.io.FileNotFoundException;

public class vroom {
    public static boolean showStack = false;

    public static void main(String[] args) {
        String inFile = "";

        for (String arg : args) {
            switch (arg) {
                case "-show-stack": {
                    showStack = true;
                }
                default: {
                    inFile = arg;
                }
            }
        }

        if (inFile.equals("")) {
            System.out.println("CANNOT CONTINUE - NO VROOM FILE");
        }

        if (!inFile.contains(".vroom")) {
            inFile += ".vroom";
        }

        try {
                
            VroomParser parser = new VroomParser(inFile);

            parser.parse();
        } catch (FileNotFoundException f) {
            System.out.println("CANNOT CONTINUE - VROOM FILE " + inFile + " INVALID");
        }
    }
}