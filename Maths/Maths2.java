// Reverse a number

import java.util.Scanner;

public class Maths2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        int reverse=0;
        while(n>0){
            int temp=n%10;
            reverse=reverse*10+temp;
            n=n/10;
        }
        System.out.println("The reverse number is: "+reverse);
    }
}
