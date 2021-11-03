package calculations;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        int low = 1;
        int high = 10;

        while (low <= high) {
            boolean br = primeornot(low);
            if (br) {
            } else {
                System.out.println(low);
            }
            low++;
        }
    }

    public static boolean primeornot(int num) {

        int i = 2;
        int count = 0;
        while (i * i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }

        if (count >= 1) {
            return true;
        }
        return false;

    }

}