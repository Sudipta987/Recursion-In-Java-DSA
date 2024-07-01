//Q10 : W.A.P to Find GCD between Three numbers using Recursion.
package Java.Recursion;
import java.util.Scanner;
public class Basic_FindGCD_Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of three numbers a,b & c: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("GCD of "+a+" , "+b+" & "+c+" is = "+findGCD(a,b,c));

        sc.close();
    }
    public static int findGCD(int a,int b,int c) {
            return findGCD(findGCD(a,b),c);
    }
    public static int findGCD(int x,int y) {
        if(x==0) {
            return y;
        }
        return findGCD(y%x,x);
    }
}
