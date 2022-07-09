import java.security.SecureRandom;

/**
 * Generating a random number within a specific range.
 */
public class Day001 {

    public static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static int generateRandomNumberBetween(int min, int max){
        if (min > max) {
            throw new IllegalArgumentException("Invalid range");
        }
        return SECURE_RANDOM.ints(min, (max + 1)) // IntStream
                .findFirst()            // OptionalInt
                .getAsInt();            // int
    }

    public static void main(String[] args) {
        System.out.println("Generating 10 numbers between 50 and 79...");
        int min = 50, max = 79;
        for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomNumberBetween(min, max));
        }
    }
}
