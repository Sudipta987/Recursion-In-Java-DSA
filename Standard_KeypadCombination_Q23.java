//Q23 : W.A.P to Print Keypad Combination Using Recursion.
//Time complexity = O(4^n)
package Java.Recursion;
import java.util.Scanner;
public class Standard_KeypadCombination_Q23 {
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Keypad numbers: ");
        String no=sc.next();
        System.out.println("Now all Possible Keypad Combinations for "+no+" keystoks are : ");
        printCombination(no,0,"");
        sc.close();
    }
    public static void printCombination(String num,int idx,String combination) {
        if(idx==num.length()) {
            System.out.println(combination);
            return;
        }
        char curNo=num.charAt(idx);
        String mapping=keypad[curNo-'0'];
        for(int i=0;i<mapping.length();i++) {
            printCombination(num, idx+1, combination+mapping.charAt(i));
        }
    } 
}
