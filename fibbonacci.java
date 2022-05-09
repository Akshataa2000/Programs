package VERYIMP;

import java.util.Scanner;

public class fibbonacci {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int a = 0;
         int b = 1;
         int n = sc.nextInt();
         System.out.println(a);
         System.out.println(b);
         

         for(int i=2;i<=n;i++)
         {
             int temp = b;
             b = b+a;
             a = temp;
             System.out.println(b);
         }
         
        sc.close();
     }
}
