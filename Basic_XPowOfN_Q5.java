//Q5 : W.A.P to Print x^n where (Stack height=n) using Recursion .
// Time Complexity = O(n) and Space Complexity= O(n)
package Java.Recursion;
import java.util.Scanner;
public class Basic_XPowOfN_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of x and n : ");
        int x=sc.nextInt(),n=sc.nextInt();
        System.out.println(x+" to the power "+n+" is = "+findPow(x,n));
        sc.close();
    }
    public static int findPow(int x,int n) {
        if(x==0) {
            return 0;
        }
        if(n==0) {
            return 1;
        }
        return x*findPow(x,n-1);
    }
}
