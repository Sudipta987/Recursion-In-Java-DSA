//Q14 : W.A.P to Find the Sum of the Elements of the Array.
package Java.Recursion;
import java.util.Scanner;
public class Basic_FindSumOfArray_Q14 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of the all Elements of the Array is = "+findSum(arr,arr.length-1));
        sc.close();
    }
    public static int findSum(int arr[],int n) {
        if(n==0) {
            return arr[n];
        }
        return arr[n]+findSum(arr, n-1);
        
    }
}
