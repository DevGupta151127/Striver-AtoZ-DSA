package Array;

import java.util.Scanner;

public class Array2 {
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
        int max=array[0];
        int secondmax=-1;
        for(int i=0;i<n;i++){
            if(array[i]>max){
                secondmax=max;
                max=array[i];
            }
            else if(array[i]>secondmax && array[i]!=max){
                secondmax=array[i];
            }
        }
        System.out.println("Second maximum element is: "+secondmax);
    }
}
