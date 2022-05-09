package VERYIMP;
import java.util.Scanner;
public class largestNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        //Approach 1 -  Assume one number to be the maximum and check assumed max with the others
        // int max = a;

        // if(b>max){
        //     max = b;
        // }
        // if(c>max){
        //     max = c;
        // }

        // System.out.println(max);

        sc.close();

        //Approach 2 - check between the two numbers and then max value with the third

        // int max =0;
        // if(a>b){
        //     max = a;
        // }
        // else{
        //     max = b;
        // }

        // if(c>max){
        //     max = c;
        // }
        // System.out.println(max);
        
        //Approach 3 - using in-built max functions

        int max = Math.max(a,b);
        System.out.println(Math.max(c,max));
    }
        
}


