//Q16 : W.A.P to Implement a isSorted Recursion Method to verify a Array.
package Java.Recursion;
import java.util.Scanner;
public class Basic_CheckArrayIsSorted_Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        if(isSorted(arr,1)) {
            System.out.println("Yes, it's an Sorted Array");
        }else{
            System.out.println("No, it's not an Sorted Array");
        }
        sc.close();
    }
    public static boolean isSorted(int arr[],int idx) {
        if(idx>=arr.length) {
            return true;
        }
        if(arr[idx-1]<arr[idx]) {
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
}
