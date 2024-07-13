// Cont Digits 

import java.util.Scanner;

public class Maths1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("The number of digits are: "+count);
    }
}
