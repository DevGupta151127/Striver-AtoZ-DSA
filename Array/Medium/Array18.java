package Array.Medium;

import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=array[j];
                if(sum>=max){
                    max=sum;
                }
                else if(sum<0){
                    sum=0;
                }
            }
        }
        System.out.println("The maximum sum array is: "+max);
        sc.close();
    }
}