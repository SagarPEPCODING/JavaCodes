package calculations;

import java.util.ArrayList;
import java.util.HashSet;

public class ScientificCalculator extends SimpleCalcualator {
    float pi = 3.14f;

    double areaOfCircle(double r) {
        return pi * r * r;
    }

    // Sieve of Erathosthenes to find out the prime numbers...
    public ArrayList<Integer> soe(int startNumber, int endNumber) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = startNumber; i <= endNumber; i++) {
            if (hs.contains(i)) {
                continue;
            } else {
                if (i != 0 && i != 1) {
                    boolean ans = checkPrimeOrNot(i);
                    // System.out.println(ans + " " + i);
                    if (!ans) {
                        arrayList.add(i);
                        int firstMul = i + i;
                        for (int mul = firstMul; mul <= endNumber;) {
                            hs.add(mul);
                            mul += i;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean checkPrimeOrNot(int num) {
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
