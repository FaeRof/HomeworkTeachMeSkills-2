
import java.util.Scanner;
public class Months {

    // месяцы пор года

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x==1||x==2||x==12)
            System.out.println("Зима");
        else if (x==3||x==4||x==5)
            System.out.println("Весна");
            else if (x==6||x==7||x==8)
            System.out.println("Лето");
                else if (x==9||x==10||x==11)
            System.out.println("Осень");
                else
            System.out.println("Нет");
    }
}
