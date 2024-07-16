package Array.Medium;

import java.util.Scanner;

public class Array17 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(count==ans){
                ans=array[i];
            }
            else if(ans==array[i]){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println("Majority element is: "+ans);
        sc.close();
    }
}
