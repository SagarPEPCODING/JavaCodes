import java.time.Duration;
import java.time.Instant;

public class multiThreadingExampleOneThread {
    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass(1, 50000);
        Instant start = Instant.now();
        thread.start();
        try {
            thread.join(); // this is used for waiting the thread1
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(ThreadClass.getPrimes());
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");
    }
}
