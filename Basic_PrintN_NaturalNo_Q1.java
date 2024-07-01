//Q1 : W.A.P to Print N Natural Numbers using Recursion .
package Java.Recursion;
import java.util.Scanner;
public class Basic_PrintN_NaturalNo_Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Here are  all n Natural numbers: ");
        printN_NaturalNo(n);
        sc.close();
    }
    public static void printN_NaturalNo(int n) {
        if(n==0) {
            return ;
        }
        printN_NaturalNo(n-1);
        System.out.print(n+"\t");
    }
}
