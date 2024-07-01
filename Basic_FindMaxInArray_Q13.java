//Q13 : W.A.P to Find Largest number from an Array Using Recursion.
package Java.Recursion;
import java.util.Scanner;
public class Basic_FindMaxInArray_Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Largest number in the Array is = "+findLar(arr,0,arr.length-1));
        sc.close();
    }
    public static int findLar(int arr[],int i,int j) {
        if(i==j) {
            return arr[i];
        }
        else if(arr[i]<arr[j]) {
            return findLar(arr, i+1, j);
        }else{
            return findLar(arr, i, j-1);
        }

    }
}
