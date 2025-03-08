package array;
import java.time.Duration;
import java.time.Instant;

public class RuntimeCaluculation {



    public static void main(String[] args) {
        // Get the current time
        Instant currentTime = Instant.now();

        // Define an earlier instant (e.g., 10 seconds ago)
        Instant pastTime = currentTime.minusSeconds(10);

        // Calculate the duration between the two instants
        Duration duration = Duration.between(pastTime, currentTime);

        // Display the difference
        System.out.println(currentTime.getNano());
        System.out.println("Time Difference: " + duration.getSeconds() + " seconds");
        System.out.println("Time Difference in Milliseconds: " + duration.toMillis() + " ms");
    }
}



