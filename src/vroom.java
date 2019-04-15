import java.util.Scanner;
import java.io.FileNotFoundException;

public class vroom {
    public static boolean showStack = false;
    public static boolean showTime = false;
    public static long startTime = 0;
    public static long endTime   = 0;

    public static void main(String[] args) {
        String inFile = "";

        for (String arg : args) {
            switch (arg) {
                case "-show-stack": {
                    showStack = true;
                }
                case "-show-time": {
                    showTime = true;
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

        if (showTime) {
            startTime = System.currentTimeMillis();
        }

        try {
            VroomParser parser = new VroomParser(inFile);

            parser.parse();

            if (showTime) {
                endTime = System.currentTimeMillis();
                System.out.println("\nPROGRAM FINISHED - EXECUTION TIME: " + (endTime - startTime) + " MS");
            }
        } catch (FileNotFoundException f) {
            System.out.println("CANNOT CONTINUE - VROOM FILE " + inFile + " INVALID");
        }
    }
}