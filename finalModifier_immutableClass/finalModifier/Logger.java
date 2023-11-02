package finalModifier;

import java.time.LocalDateTime;

public class Logger {
    public static void logToConsole(CharSequence message) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("%1$tD %1$tT: %2$s".formatted(time, message));
        if (message instanceof StringBuilder bf) {
            bf.setLength(0);
        }
    }
}
