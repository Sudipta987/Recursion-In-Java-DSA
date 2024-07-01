//Q22 : W.A.P to print all the Unique Subsequences of a String using Recursion.
package Java.Recursion;
import java.util.Scanner;
import java.util.HashSet;
public class Standard_UniqueSubseqOfStr_Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.next();
        HashSet<String> set=new HashSet<>();
        System.out.println("Now all possible Unique Subsequences are : ");
        printUniqueSubseq(str,0,"",set);
        sc.close();
    }
    public static void printUniqueSubseq(String str,int idx,String newStr,HashSet<String> set) {
        if(idx==str.length()) {
            if(set.contains(newStr)) {
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char curChar=str.charAt(idx);
        printUniqueSubseq(str, idx+1, newStr+curChar, set);
        printUniqueSubseq(str, idx+1, newStr, set);
    }
}