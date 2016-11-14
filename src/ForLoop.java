/**
 * Created by lloyd on 11/14/16.
 */
public class ForLoop {
    public static void main(String[] args) {

        for(int i = 0; i <= 100; i++) {
            if(i > 0 && (i % 2) == 0) {
                System.out.println(i);
            }
        }
        for (int j = 100; j >= -10; j -= 5) {
            System.out.println(j);
        }
        for (int k = 2; k < 1000000 && k > 0; k *= k) {
            System.out.println(k);
        }
    }
}
