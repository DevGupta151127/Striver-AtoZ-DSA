// Factorial of number 

import java.util.Scanner;

public class Recursion5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        factorial(1,1,n);
    }
    public static void factorial(int i,int fact,int n){
        if(n==0){
            System.out.println(0);
            return;
        }
        if(i>n){
            System.out.println(fact);
            return;
        }
        factorial(i+1, fact*i, n);
    }
}
