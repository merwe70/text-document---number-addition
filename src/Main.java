import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try{
            FileReader fReader = new FileReader("sayilar.txt");
            BufferedReader bReader = new BufferedReader(fReader);

            String line;
            int total = 0;

            while ((line = bReader.readLine()) != null) {
                total += Integer.parseInt(line);
            }

            System.out.println("'sayilar.txt' adlı dosyadaki sayıların toplamı, " + total + " eder");
            fReader.close();
            bReader.close();

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}