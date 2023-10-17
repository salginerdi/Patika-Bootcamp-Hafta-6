import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // We get a text from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Text: ");
        String text = scanner.nextLine();
        scanner.close();
        // We print this text to a file.
        try {
            FileWriter fWriter = new FileWriter("notes.txt");
            PrintWriter pWriter = new PrintWriter(fWriter);
            pWriter.print(text);
            pWriter.close();
            // Reading texts from the file
            FileReader fReader = new FileReader("notes.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            String readText = bReader.readLine();
            bReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
