package Array.Medium;

import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target=sc.nextInt();
        int found=0;
        int left=0;
        int right=n-1;
        while(left<=right){
            int sum=array[left]+array[right];
            if(sum==target){
                found=1;
                break;
            }
            left++;
            right--;
        }
        if(found==0){
            System.out.print("No such pair exists");
        }
        else{
            System.out.print("The target met at: "+left+" "+right);
        }
        sc.close();
    }
}
