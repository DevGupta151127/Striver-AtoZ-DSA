// Sum of N numbers

import java.util.Scanner;

public class Recursion4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        print(n,0);
    }
    public static void print(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        print(i-1, sum+i);
    }
}
