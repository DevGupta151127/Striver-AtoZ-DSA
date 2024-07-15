package Array;

import java.util.Scanner;

public class Array5 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        int temp=array[0];
        for(int i=1;i<n;i++){
            array[i-1]=array[i];
        }
        array[n-1]=temp;
        System.out.println("Array after left rotate by one place is: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
