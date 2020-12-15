// вывод нечётных чисел до числа x
import java.util.Scanner;
public class NotEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for(int y=1; y<=x; y++)
            if (y-1==0)
                System.out.println(y);
            else if ((y-1)%2==0)
                System.out.println(y);
    }
}
