//Q24 : Print all Permutations of a String Using Recursion.
package Java.Recursion;
import java.util.Scanner;
public class Adv_PermutationsOfStr_Q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println("Now all possible Permutations of a String are: ");
        printPerm(str,"");
        sc.close();
    }
    public static void printPerm(String str,String permutation) {
        if(str.length()==0) {
            System.out.print(permutation+"\t");
            return;
        }
        for(int i=0;i<str.length();i++) {
            char cur=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPerm(newStr, permutation+cur);
        }
    }
}
