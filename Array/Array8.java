package Array;

import java.util.Scanner;

public class Array8 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int search=sc.nextInt();
        sc.close();
        int found=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(array[i]==search){
                index=i;
                found=1;
            }
        }
        if(found==1){
        System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("Not found");
        }
    }
}
