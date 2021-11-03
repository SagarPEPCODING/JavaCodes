import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {
        File fInput = new File(
                "C:\\Users\\Mobile Programming\\Downloads\\javaMPL-main (2)\\javaMPL-main\\FileHandling\\TestQuestion2\\Input.txt");

        try {
            FileWriter fOutput = new FileWriter(
                    "C:\\Users\\Mobile Programming\\Downloads\\javaMPL-main (2)\\javaMPL-main\\FileHandling\\TestQuestion2\\Output.txt");
            Scanner sc = new Scanner(fInput);
            while (sc.hasNextLine()) {
                String val = sc.nextLine();
                int myNewVal = Integer.parseInt(val);
                if (myNewVal % 2 == 0) {
                    System.out.println(myNewVal);
                    String result = String.valueOf(myNewVal);
                    fOutput.write(result + '\n');
                }
            }
            sc.close();
            fOutput.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Some issuw | Please contact developer.");
        }
    }
}
