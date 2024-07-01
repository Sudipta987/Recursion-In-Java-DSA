//Q12 : W.A.P to print the values of an Array and also its Reverse Array  Recursively.
package Java.Recursion;
import java.util.Scanner;
public class Basic_PrintArray_Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements in Correct Order: ");
        printArr(arr,0,arr.length-1);
        System.out.println("\nArray Elements in Reverse order: ");
        printRevArr(arr, 0, arr.length-1);
        sc.close();
    }
    // Print Normal Array
    public static void printArr(int arr[],int i,int j) {
        if(i==j) {
            System.out.print(arr[i]+"\t");
            return ;
        }
        System.out.print(arr[i]+"\t");
        printArr(arr, i+1, j);
    }
    //Print Reverse Order Array
    public static void printRevArr(int arr[],int i,int j) {
        if(i==j) {
            System.out.print(arr[i]+"\t");
            return ;
        }
        printRevArr(arr, i+1, j);
        System.out.print(arr[i]+"\t");
    }

}
