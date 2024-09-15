import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WC {

    public WC() {
    }

    public int countLines(String fileName) {
        int linesCount = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                linesCount++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return linesCount;
    }

    public int countBytes(String fileName) {
        int bytesCount = 0;

        try (FileInputStream fis = new FileInputStream(fileName)) {
            // Read each byte from the file
            while (fis.read() != -1) {
                bytesCount++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
        return bytesCount;
    }

    public int countChar(String fileName) {
        int charCount = 0;

        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr)) {

            int c;
            while ((c = reader.read()) != -1) {
                // Count the number of characters
                charCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return charCount;
    }

    public int countWords(String fileName) {
        int wordCount = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                // Read each word
                scanner.next();
                wordCount++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

}

