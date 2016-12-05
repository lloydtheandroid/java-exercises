package sheeps;

/**
 * Created by lloyd on 12/5/16.
 */
public class CountTestApp {
    public static void main(String[] args) {

        System.out.println("Counting alligators... ");
        Countable alligator = new Alligator();
        CountUtil.count(alligator, 3);

        System.out.println("Counting Sheep... ");
        Sheep blackie = new Sheep("Blackie");
        CountUtil.count(blackie, 2);

        Sheep dolly = (Sheep) blackie.clone();
        dolly.setName("Dolly");
        CountUtil.count(dolly, 3);

        blackie.resetCount();
        CountUtil.count(blackie, 1);
    }
}
