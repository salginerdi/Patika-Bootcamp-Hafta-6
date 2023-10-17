import java.io.*;

public class Main {
    public static void main(String[] args) {
        // .txt dosyasını oluşturuyoruz.
        int number1 = 5;
        int number2 = 10;
        int number3 = 20;
        int number4 = 12;
        int number5 = 33;

        File file = new File("toplamaislemi.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            FileWriter fWriter = new FileWriter(file, false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            String n1f = String.format("%02d", number1);
            String n2f = String.format("%02d", number2);
            String n3f = String.format("%02d", number3);
            String n4f = String.format("%02d", number4);
            String n5f = String.format("%02d", number5);

            bWriter.write(n1f);
            bWriter.newLine();
            bWriter.write(n2f);
            bWriter.newLine();
            bWriter.write(n3f);
            bWriter.newLine();
            bWriter.write(n4f);
            bWriter.newLine();
            bWriter.write(n5f);

            bWriter.close();

            // .txt dosyasını okuyoruz.
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            String line;
            int total = 0;
            while ((line = bReader.readLine()) != null) {
                String n1 = line.substring(0, 2);
                int num = Integer.parseInt(n1);
                total += num;
            }

            // Toplamı konsola bastırıyoruz.
            System.out.println("Total: " + total);
            bReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
