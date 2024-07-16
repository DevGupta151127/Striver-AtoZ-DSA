package Array;

import java.util.Scanner;

public class Array13 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the sum for which you need longest subarray: ");
        int k=sc.nextInt();
        int len=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=array[j];
                if(sum==k){
                    len=Math.max(len, j-i+1);
                }
            }
        }
        System.out.println("Longest subarray with given sum is: "+len);
        sc.close();
    }
}
