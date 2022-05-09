package VERYIMP;

import java.util.Scanner;

public class countingOccurances {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // String s = Integer.toString(n);
        
        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem ==3){
                count++;
            }
            n = n/10;
            
        }
        System.out.println(count);
        sc.close();

    }
    
}
