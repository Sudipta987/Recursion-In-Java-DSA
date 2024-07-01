////Q4 : W.A.P to Print Fibonacci Sequence till n^th term using Recursion .
//Time Complexity= O(2^n)  And Space Complexity = O(n)
package Java.Recursion;
import java.util.Scanner;
public class Basic_FibonacciSeq_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("Now "+n+" th term Fibonacci Number is = "+findFibSeq(n));
        // for(int i=0;i<=n;i++) {
        //     System.out.print(findFibSeq(i)+"\t");
        // }
        sc.close();
    }
    public static int  findFibSeq(int n) {
        if(n==0||n==1) {
            return n;
        }
        return findFibSeq(n-1)+findFibSeq(n-2);

    }
}
