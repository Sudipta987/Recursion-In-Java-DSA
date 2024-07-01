//Q3 : W.A.P to Print Factorial of N  Number using Recursion .
package Java.Recursion;
import java.util.Scanner;
public class Basic_FindFactOfN_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value which you want to find Factorial : ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is = "+findFactOf(n));
        sc.close();
    }
    public static long  findFactOf(int n) {
        if(n==0) {
            return 1;
        }
        return n*findFactOf(n-1);
    }
}
