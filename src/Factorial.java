
import java.util.Scanner;
public class Factorial {

    /// факториаллллллллллллллллллллллллллл

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int N=1;
        for (int i=1; i<=x;i++,N=N*i)
            if (i==x)
            System.out.println(N);
    }
}
