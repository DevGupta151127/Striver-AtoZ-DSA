package Array;

import java.util.Scanner;

public class Array3 {
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
        int sorted=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    sorted=1;
                }
            }
        }
        if(sorted==0){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array not sorted");
        }
    }
}
