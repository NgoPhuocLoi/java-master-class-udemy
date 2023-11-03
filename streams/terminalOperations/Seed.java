package terminalOperations;

import java.util.Random;

public record Seed(boolean isBooked) {

    public Seed() {
        this(new Random().nextBoolean());
    }
}
