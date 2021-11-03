import java.time.Duration;
import java.time.Instant;

public class multithreadingExampleTwoThreads {
    public static void main(String[] args) {
        ThreadClass thread1 = new ThreadClass(1, 25000);
        ThreadClass thread2 = new ThreadClass(25001, 50000);

        Instant start = Instant.now();
        thread1.start();
        thread2.start();

        try {
            thread1.join(); // this is used for waiting the thread1 
            thread2.join(); // this is used for waiting the threads2
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(ThreadClass.getPrimes());
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");
    }

}