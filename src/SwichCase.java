

import java.util.Scanner;
//                      Дни неделли

public class SwichCase {
    public static void main(String[]args){
      Scanner s =new Scanner(System.in);
      int x =s.nextInt();
      switch (x){
          case 1:
              System.out.println("Понедельник");
              break;
              case 2:
              System.out.println("Вторник");
              break;
              case 3:
              System.out.println("Среда");
              break;
              case 4:
              System.out.println("Четверг");
              break;
              case 5:
              System.out.println("Пятница");
              break;
              case 6:
              System.out.println("Суббота");
              break;
          case 7:
              System.out.println("Воскресение");
              break;
          default:
              System.out.println("Нет");
      }
    }
}
