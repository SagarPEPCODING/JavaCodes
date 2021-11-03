import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Question1
 */
public class Question1 {

    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        for (int i = 0; i < n; i++) {
            listOfNumbers.add(src.nextInt());
        }

        // a. Apply filter functions to filter all the odd numbers and
        // collect them into a new ArrayList. (10 Marks)

        List<Integer> ansListA = listOfNumbers.stream().filter((item) -> {
            if (item % 2 != 0) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());

        System.out.println("Collection of OddNumbers :- " + ansListA);

        // b. Apply map functions to make a cube of every number
        // and
        // collect all the cubes into a new arrayList. (10 Marks)

        List<Integer> ansListB = listOfNumbers.stream().map((item) -> {
            return item * item * item;
        }).collect(Collectors.toList());
        System.out.println("Collection of Cubic Numbers :- " + ansListB);
    }
}