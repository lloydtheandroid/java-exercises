package sheeps;

/**
 * Created by lloyd on 12/5/16.
 */
public class CountUtil {
    static void count (Countable c, int maxCount) {
        for (int i = 0; i < maxCount; i++) {
            System.out.println(c.getCountString());
        }
    }

}
