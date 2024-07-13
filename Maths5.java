// Armstrong Number

import java.util.Scanner;

public class Maths5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        int original=n;
        while(n>0){
            int temp=n%10;
            sum=sum+(int)Math.pow(temp,3);
            n=n/10;
        }
        if(sum==original){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("No");
        }
    }
}
