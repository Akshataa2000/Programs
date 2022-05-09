package VERYIMP;

 import  java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // System.out.println(isArmstrong(n));
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

        sc.close();


        
    }

    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            rem = rem*rem*rem;
            sum= sum + rem;
            n=n/10;
        }

        return sum==temp;


    }
}
