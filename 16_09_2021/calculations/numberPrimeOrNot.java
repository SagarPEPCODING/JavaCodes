package calculations;

public class numberPrimeOrNot {
    public static void main(String[] args) {
        boolean ans = checkPrimeOrNot(31);
        if(ans) {
            System.out.println("NOT PRIME");
        }else {
            System.out.println("PRIME NUMBER");
        }
    }
    private static boolean checkPrimeOrNot(int num) {
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
