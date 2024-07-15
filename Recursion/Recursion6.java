// Reverse an array

import java.util.Scanner;

public class Recursion6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int start=0;
        int end=n-1;
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
