/* Mouse Jiggler in Java
// Copy the code into a file and save it as Mvs.java
// open cmd/terminal and type: javac Mvs.java
// run the generated class file with the command: java Mvs
// Ctrl+c to exit the program
*/
import java.awt.Robot;
import java.util.Random;
import java.time.LocalDateTime;

public class Mvs {
    public static final int FIVE_MINUTES = 300_000; // 1000 x 60 x 5
    public static final int SET_TIME_HOURS = 17; // Exit the program at 5PM
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
