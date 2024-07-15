package Array;

import java.util.Scanner;

public class Array1 {
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
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Maximum element is: "+max);
    }
}
