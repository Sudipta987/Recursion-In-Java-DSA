//Q2 : W.A.P to Print  Sum of First N Natural Numbers using Recursion .
package Java.Recursion;
import java.util.Scanner;
public class Basic_SumOfFirstN_NaturalNo_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n=sc.nextInt();
        System.out.println("Sum of First "+n+" Natural number is : "+findSumOfN(n));
        sc.close();
    }
    public static int findSumOfN(int n) {
        if(n==0) {
            return 0;
        }
        return n+findSumOfN(n-1);
    }
}
