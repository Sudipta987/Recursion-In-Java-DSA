//Q20 : W.A.P to Remove Duplicates in a String using Recursion .
//NOTE : This code is Applicable for only that kind of String which contains only alphabets not even contain Spaces ald also case sensitive.
package Java.Recursion;
import java.util.Scanner;
public class Standard_RemoveDuplicatesInStr_Q20 {
    public static boolean map[]=new boolean[26];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String as input : ");
        String str=sc.next();
        String newStr=""; 
        System.out.println("Now the String Without Duplicates: ");
        removeDuplicatesStr(str,0,newStr);   
        sc.close();
    }
    public static void removeDuplicatesStr(String str,int idx,String newStr) {
        if(idx==str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']) {
            removeDuplicatesStr(str, idx+1, newStr);

        }else{
            newStr+=currChar;
            map[currChar-'a']=true;
            removeDuplicatesStr(str, idx+1, newStr);
        }
    }
}
