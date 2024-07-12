// Print from 1 to N using Backtracking

import java.util.Scanner;

public class Recursion2_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        print(n,n);
    }
    public static void print(int i,int n){
        if(i<1){
            return;
        }
        print(i-1, n);
        System.out.println(i);
    }
}