package VERYIMP;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n; //1331
        int sum = 0;
        while(n>0){
        int rem = n%10;
        n=n/10;
        sum = sum*10 + rem;
        }

        if(sum==temp){
            System.out.println("Palindrome 633" + sum + " " + temp);
        }
        else
        {
            System.out.println("Not a palindrome "+ sum + " " + temp);
        }

        sc.close();
    }
}
