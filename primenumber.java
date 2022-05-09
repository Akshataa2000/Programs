package VERYIMP;
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check prime or not.");
        int num = sc.nextInt();
        
        int c = 2, flag=0;
        while(c<Math.sqrt(num)) //optimisation, instead of going to the number we'll go to the square root of the number
        {
            if(num%c==0){
                flag = 1;
                System.out.println("Not prime");
                break;
            }
            c++;
        }
        if(flag == 0)
            System.out.println("Prime");
        sc.close();
    }
    
}
