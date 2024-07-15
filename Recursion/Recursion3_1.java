// Print numbers from N to 1 using backtracking

import java.util.Scanner;

public class Recursion3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        print(1,n);
    }
    public static void print(int i,int n){
        if(i>n){
            return;
        }
        print(i+1, n);
        System.out.println(i);
    } 
}
