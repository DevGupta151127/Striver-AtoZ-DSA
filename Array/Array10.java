package Array;

import java.util.Scanner;

public class Array10 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n-1];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n-1;i++){
            array[i]=sc.nextInt();
        }
        int sum=(n*(n+1))/2;
        int actualsum=0;
        for(int i=0;i<n-1;i++){
            actualsum+=array[i];
        }
        System.out.println("Missing element is: "+(sum-actualsum));
        sc.close();
    }
}
