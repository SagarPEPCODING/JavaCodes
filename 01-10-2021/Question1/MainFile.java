
import java.util.ArrayList;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        src.nextLine();

        ArrayList<StudentClass> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("*********************************************************");
            System.out.println("Enter the name :- ");
            String name = src.nextLine();
            System.out.println("Enter the phone :- ");
            String phone = src.nextLine();
            System.out.println("Enter the age :- ");
            int age = src.nextInt();
            src.nextLine();
            StudentClass stObj = new StudentClass(name, phone, age);
            arrayList.add(stObj);
        }

        for (int i = 0; i < n; i++) {
            StudentClass student = arrayList.get(i);
            if (student.getAge() > 18) {
                System.out.println(student.toString());
            }
        }
    }
}
