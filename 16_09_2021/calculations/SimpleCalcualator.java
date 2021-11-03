package calculations;

public class SimpleCalcualator {

    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        return num1 / num2;
    }

    // finds gcd -> greatest common divisor...
    public int gcd(int val1, int val2) {
        int gcd = 1;

        for (int i = 1; i <= val1 && i <= val2; ++i) {
            // Checks if i is factor of both integers
            if (val1 % i == 0 && val2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    // finds lcm -> least common multiple
    public int lcm(int val1, int val2) {
        int lcm = 0;
        if (val1 > val2) {
            lcm = val1;
        } else {
            lcm = val2;
        }
        boolean ans = true;
        while (ans) {
            if (lcm % val1 == 0 && lcm % val2 == 0) {
                break;
            }
            lcm++;
        }
        return lcm;
    }
}
