//Q18 : W.A.P to print a String in Reverse Order using Recursion.
package Java.Recursion;
import java.util.Scanner;
public class Standard_PrintRevStr_Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        printRevStr(str,0);
        sc.close();
    }
    public static void printRevStr(String str ,int idx) {
        if(idx==str.length()) {
            return;
        }
        printRevStr(str, idx+1);
        System.out.print(str.charAt(idx));

    }
}
