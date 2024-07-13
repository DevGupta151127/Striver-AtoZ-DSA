// Check palindrome or not

import java.util.Scanner;

public class Maths3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        int original=n;
        int reverse=0;
        while(n>0){
            int temp=n%10;
            reverse=reverse*10+temp;
            n=n/10;
        }
        if(reverse==original){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
