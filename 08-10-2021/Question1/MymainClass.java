import java.io.FileWriter;
import java.util.Scanner;

public class MymainClass {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String name = src.nextLine();
        String email = src.nextLine();
        String phone = src.nextLine();

        User userIs = new User(name, email, phone);
        String MyStringIs = userIs.toString();
        System.out.println(MyStringIs);

        try {
            FileWriter fw = new FileWriter("C:\\Users\\Mobile Programming\\tpp\\JavaCodes\\08-10-2021\\textFIle.txt");

            fw.write(MyStringIs);
            fw.close();
        } catch (Exception e) {
            System.out.println("some erroroccured");
        }
    }
}
