// GCD or HCF 

import java.util.Scanner;

public class Maths4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n=sc.nextInt();
        System.out.print("Enter the second number: ");
        int m=sc.nextInt();
        sc.close();
        int GCD=0;
        for(int i=1;i<=n && i<=m;i++){
            if(n%i==0 && m%i==0){
                GCD=Math.max(GCD,i);
            }
        }
        System.out.println("Greatest common divispr is: "+GCD);
    }
}
