//Q9 : W.A.P to Find the Sum of natural numbers till n but with alternate signs Using Recursion.
//That means if n=5 then we have to return 1-2+3-4+5=3 as our Answer.           Time Complexity=O(n) and Space Complexity= O(n)
package Java.Recursion;
import java.util.Scanner;
public class Basic_PrintSumOfSeries_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("The Sum of the series till "+n+" is = "+findSumOfSeries(n));
        sc.close();
    }
    public static int findSumOfSeries(int n) {
        if(n==1) {
            return 1;
        }
        if(n%2==0) {
            return findSumOfSeries(n-1)-n;
            
        }else{
            return findSumOfSeries(n-1)+n;
        }
    }
}
