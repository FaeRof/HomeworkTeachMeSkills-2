
import java.util.Scanner;
public class YesNo {
    // вывод Yes обоих числа 1 и 2 в деапозоне ну остольное понятно

    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        double x =s.nextDouble(), y=s.nextDouble();
        if (x<=1&&x>=0)
            if (y<=1&&y>=0)
                System.out.println("Yes");
        else
                System.out.println("No");
            else
            System.out.println("No");

    }
}
