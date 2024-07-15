package Array;

import java.util.Scanner;

public class Array11 {
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
        int count=0;
        for(int i=0;i<n;i++){
            if(array[i]==1){
                count++;
                if(count>=max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println("Maximum consecutive ones are: "+max);
        sc.close();
    }
}
