package Array;

import java.util.Scanner;

public class Array7 {
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
        sc.close();
        int j=0;
        for(int i=0;i<n;i++){
            if(array[i]!=0){
                B[j]=array[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            array[i]=B[i];
        }
        System.out.println("Array after moving zeros to end: ");
        for(int i=0;i<n;i++){
            System.out.println(array[i]+" ");
        }
    }
}
