//Q19 : W.A.P to Find the First and Last Occurance of an Element in String using Recursion.
package Java.Recursion;
import java.util.Scanner;
public class Standard_FirstAndLast_OccuranceOfStr_Q19 {
    public static int first=-1;
    public static  int last=-1;
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println("Enter the Searching Element: ");
        char x=sc.next().charAt(0);
        findFirstLast(str,x,0);
        sc.close();
    }
    public static void findFirstLast(String str,char x,int idx)  {
        if(idx==str.length()) {
            System.out.println(x+" Occurs at first index: "+first);
            System.out.println(x+" Occurs at last index: "+last);
            return;
        }
    if(str.charAt(idx)==x) {
        if(first==-1) {
            first=idx;
        }else{
            last=idx;
        }
    }
    findFirstLast(str,x,idx+1);
}
    
}
