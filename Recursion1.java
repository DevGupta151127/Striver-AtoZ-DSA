// Print somthing N times

import java.util.Scanner;

public class Recursion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        print(1,n);
        sc.close();
    }
    public static void print(int i, int n){
        if(i>n)
            return;
        System.out.println("I am Dev!!");
        i++;
        print(i,n);
    }
}