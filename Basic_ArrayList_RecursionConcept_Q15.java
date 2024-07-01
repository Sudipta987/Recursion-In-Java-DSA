//Q15 : W.A.P to Return all indices as Array List if X Exists in the Array.
package Java.Recursion;
import java.util.Scanner;
import java.util.ArrayList;
public class Basic_ArrayList_RecursionConcept_Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Searching Element: ");
        int x=sc.nextInt();
        ArrayList<Integer> ans=allIndices(arr, arr.length, x, 0);
        for(Integer i: ans) {
            System.out.print(i+"\t");
        }
        // System.out.println(ans);
        sc.close();
    }
    public static ArrayList<Integer> allIndices(int arr[],int n,int x,int idx) {
        if(idx>=n) {
            return new ArrayList<Integer>();    //return Empty ArrayList
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(arr[idx]==x) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns=allIndices(arr,n,x,idx+1);
        ans.addAll(smallAns);
        
        return ans;
    } 
}
