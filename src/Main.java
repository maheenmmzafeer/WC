public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            printHelp();
            return;
        }

        // Initialize flags and file name
        boolean countLines = false;
        boolean countWords = false;
        boolean countChars = false;
        boolean countBytes = false;
        String fileName = null;

        // Parse command-line arguments
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-l":
                    countLines = true;
                    break;
                case "-w":
                    countWords = true;
                    break;
                case "-c":
                    countChars = true;
                    break;
                case "-b":
                    countBytes = true;
                    break;
                default:
                    if (i == args.length - 1) {
                        fileName = args[i];
                    } else {
                        printHelp();
                        return;
                    }
            }
        }

        // If no file name was provided
        if (fileName == null) {
            printHelp();
            return;
        }

        // Create an instance of WC
        WC wc = new WC();

        // Default behavior: run all methods
        if (!countLines && !countWords && !countChars && !countBytes) {
            countLines = true;
            countWords = true;
            countChars = true;
            countBytes = true;
        }

        // Perform the requested counts
        if (countLines) {
            System.out.println("Number of lines: " + wc.countLines(fileName));
        }
        if (countWords) {
            System.out.println("Number of words: " + wc.countWords(fileName));
        }
        if (countChars) {
            System.out.println("Number of characters: " + wc.countChar(fileName));
        }
        if (countBytes) {
            System.out.println("Number of bytes: " + wc.countBytes(fileName));
        }
    }

    private static void printHelp() {
        System.out.println("Usage: java Main [options] <file>");
        System.out.println("Options:");
        System.out.println("  -l    Count lines");
        System.out.println("  -w    Count words");
        System.out.println("  -c    Count characters");
        System.out.println("  -b    Count bytes");
        System.out.println("If no options are provided, all counts are performed.");
    }
}
