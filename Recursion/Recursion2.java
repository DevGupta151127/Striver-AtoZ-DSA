// Print numbers from 1 to N
import java.util.Scanner;

public class Recursion2 {
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
        System.out.println(i);
        i++;
        print(i,n);
    }
}
