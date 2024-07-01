//Q7 : W.A.P to Find out the sum of its digits using recursion.
//Time Complexity=O(d) ,where d=number of digits  and Space Complexity = O(d) 
package Java.Recursion;
import java.util.Scanner;
public class Basic_SumOfDigits_Q7 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Sum of the digits of "+n+" is = "+findSumOfDigits(n));
        sc.close();
    }
    public static int findSumOfDigits(int n) {
        // if(n==0) {
        //     return 0;
        // }
        if(n>=0 && n<=9) {    
        return n;
        }
        return findSumOfDigits(n/10)+(n%10);
    }
}
