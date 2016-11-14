/**
 * Created by lloyd on 11/14/16.
 */
public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        while (i < 100 && i >= 0);
        do {
            i -= 5;
            System.out.println(i);
        }
        while (i > -10);

        int n = 2;
        do {

            System.out.println(n);
            n = n * n;
        }
        while (n <= 1000000 && n > 0);
    }

}
