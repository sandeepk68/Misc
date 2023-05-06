// Mouse Jiggler in Java
// Ctrl+c to exit the program

import java.awt.Robot;
import java.util.Random;
import java.time.LocalDateTime;

public class Mvs {
    public static final int FIVE_MINUTES = 300_000;
    public static final int SET_TIME_HOURS = 17;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        
        int hour;
        int minute;
        
        Robot robot = new Robot();
        Random random = new Random();
        
        do {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(FIVE_MINUTES);
            
            LocalDateTime now = LocalDateTime.now();
            hour = now.getHour();
            minute = now.getMinute();
            
            // System.out.println(hour:minute);
        } while (hour != SET_TIME_HOURS)
    }
}
