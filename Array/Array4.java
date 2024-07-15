package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array4 {
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
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(array[i]);
        }
        System.out.println("Array after removing duplicates is: "+set);
    }
}
