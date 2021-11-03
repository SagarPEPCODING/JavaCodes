import java.util.ArrayList;
import calculations.ScientificCalculator;

class Intro {
    public static void main(String[] args) {
        ScientificCalculator calculate = new ScientificCalculator(); // Initialized the object
        int ans = calculate.subtraction(12, 34); // Use the object to access members
        // System.out.println(calculate.areaOfCircle(12.32));
        System.out.println(ans);
        int gcd = calculate.gcd(12, 18);
        System.out.println(gcd);
        int lcm = calculate.lcm(12, 18);
        System.out.println(lcm);
        ArrayList<Integer> ansList = calculate.soe(1, 10000000);
        System.out.println(ansList);
    }
}