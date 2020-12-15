
import java.util.Scanner;
public class PrimeCheck {

    // проверка простое ли число

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int j, k = 0;

            for (j = 2; j <= x; j++) {
                if ((x % j) == 0)
                    k++;
            }
            if (k < 2)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }

