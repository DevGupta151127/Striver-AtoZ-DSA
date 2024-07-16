package Array;

import java.util.Scanner;

public class Array12 {
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
        for(int i=0;i<n;i++){
            int count=0;
            int num=array[i];
            for(int j=i;j<n;j++){
                if(array[j]==num){
                    count++;
                }
            }
            if(count==1){
                System.out.println("The number that appears one is: "+num);
            }
        }
    }
}
