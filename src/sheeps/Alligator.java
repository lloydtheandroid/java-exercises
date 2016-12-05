package sheeps;

/**
 * Created by lloyd on 12/5/16.
 */
public class Alligator implements Countable {
    private int count = 0;

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 0;

    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return count + " alligator";
    }
}
