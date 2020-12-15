import java.util.Scanner;

/*
Наибольший делитетель из 2-х чисел
 */
public class Divider {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Первое число");
        int i = s.nextInt();

        System.out.println("Второе число");
        int j = s.nextInt();

        if (i==0|| j==0)
            System.out.println(0);

        else {
            if (i<0){
                i=i*-1;
            }
            for (int x=i+1; x>=1; x--){
                if (i%x==0 && j%x==0){
                    System.out.println("Наибольший делитель "+x);
                    break;
                }
            }
        }

    }
}
