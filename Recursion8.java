// Fabonacci Number

import java.util.Scanner;

public class Recursion8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you need: ");
        int n=sc.nextInt();
        sc.close();
        System.out.println(Fabonacci(n));
    }
    public static int Fabonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            return(Fabonacci(n-1)+Fabonacci(n-2));

        }
    }
}
