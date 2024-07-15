import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows you want: ");
        int n=sc.nextInt();
        sc.close();
        int value=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+value));
                value=value-1;
            }
            System.out.println();
        }
    }
}
