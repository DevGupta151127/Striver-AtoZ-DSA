// Print number from N to 1

import java.util.Scanner;

public class Recursion3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number from where you want to print: ");
        int n=sc.nextInt();
        sc.close();
        print(n,n);
    }
    public static void print(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        i--;
        print(i,n);
    }
}
