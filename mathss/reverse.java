package mathss;

import java.util.Scanner;

public class reverse {

   public static void main(String[] args) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the number");
      int n = var1.nextInt();
      int rev = 0;

      while (n > 0) {
         int extract = n%10;
         rev = 10*rev +extract;
                 n = n/10;
      }
      System.out.println(rev);

   }
}