//Q28 : W.A.P to Print all the Subsets of a set of First N Natural numbers .
package Java.Recursion;
import java.util.Scanner;
import java.util.ArrayList;
public class Adv_PrintSubsetsOfSet_Q28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        ArrayList<Integer> subset=new ArrayList<>();
        findSubset(n,subset);
        System.out.println(subset);
        sc.close();
    }
    public static void findSubset(int n,ArrayList<Integer> subset) {
        if(n==0) {
           System.out.println(subset);
            return;
        }
        //Add hoga 
        subset.add(n);
        findSubset(n-1, subset);
        //Add nahi hoga
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
} 