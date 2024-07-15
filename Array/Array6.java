package Array;

import java.util.Scanner;

public class Array6 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int[] B=new int[n];
        System.out.print("Enter by how much element you want to left rotate: ");
        int d=sc.nextInt();
        sc.close();
        int j=0;
        for(int i=d;i<n;i++){
            B[j]=array[i];
            j++;
        }
        for(int i=0;i<d;i++){
            B[j]=array[i];
            j++;
        }
        for(int i=0;i<n;i++){
            array[i]=B[i];
        }
        System.out.println("Array after left rotate D places: ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]+" ");
        }
    }
}
