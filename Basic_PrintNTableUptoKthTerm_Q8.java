//Q8 : W.A.P where Given a number num and value k. Print k multiples of num.
package Java.Recursion;
import java.util.Scanner;
public class Basic_PrintNTableUptoKthTerm_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num & k : ");
        int num=sc.nextInt();
        int k=sc.nextInt();
        System.out.println("Now the multiplication of "+num+" from 1 to "+k+" are: ");
        printMultiples(num,k);
        sc.close();
    }
    public static void printMultiples(int n,int k) {
        if(k==0) {
            return ;
        }
        printMultiples(n, k-1);
        System.out.print(n*k+"\t");
       
    }
}
