// Check string is palindrome or not

import java.util.Scanner;

public class Recursion7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
        sc.close();
        String rev="";
        char[] ch=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
        if(s.equals(rev)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("No");
        }
    }
}
