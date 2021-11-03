import java.util.ArrayList;

public class ThreadClass extends Thread {
    private int startingNumber, endingNumber;
    private static ArrayList<Integer> ArrayListOfPrimeNumbers = new ArrayList<>();

    public ThreadClass(int startingNumber, int endingNumber) {
        this.startingNumber = startingNumber;
        this.endingNumber = endingNumber;
    }

    public static ArrayList<Integer> getPrimes() {
        return ThreadClass.ArrayListOfPrimeNumbers;
    }

    public void run() {

        for (int i = this.startingNumber; i <= this.endingNumber; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                this.ArrayListOfPrimeNumbers.add(i);
            }
        }

    }
}
