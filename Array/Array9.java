package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array9 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array1: ");
        int n1=sc.nextInt();
        int[] array1=new int[n1];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of array2: ");
        int n2=sc.nextInt();
        int[] array2=new int[n1];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n2;i++){
            array2[i]=sc.nextInt();
        }
        sc.close();
        int j=0;
        int[] union=new int[n1+n2];
        for(int i=0;i<n1;i++){
            union[j]=array1[i];
            j++;
        }
        for(int i=0;i<n2;i++){
            union[j]=array2[i];
            j++;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<union.length;i++){
            set.add(union[i]);
        }
        System.out.print("Union of both array will be: "+set);
    }
}
