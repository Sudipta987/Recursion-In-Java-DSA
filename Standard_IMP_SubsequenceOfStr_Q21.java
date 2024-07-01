//Q21 : W.A.P to Print all the Subsequences of a String Using Recursion.
//Time Complexity = O(2^n)  , where n=length of the String 
package Java.Recursion;
import java.util.Scanner;
public class Standard_IMP_SubsequenceOfStr_Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.next();
        System.out.println("Now all the possible Subsequences are : ");
        printSubseq(str,0,"");
        sc.close();
    }
    public static void printSubseq(String str,int idx,String newStr) {
        if(idx==str.length()) {
            System.out.println(newStr);
            return;
        }
        char cuChar=str.charAt(idx);
        printSubseq(str, idx+1, newStr+cuChar);
        printSubseq(str, idx+1, newStr);
    }
}
