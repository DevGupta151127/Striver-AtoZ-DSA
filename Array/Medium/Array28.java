package Array.Medium;

import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the subarray for which you have to count subarray: ");
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=array[j];
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println("The number of subarray with given sum are: "+count);
        sc.close();
    }
}