//Q25 : W.A.P to Count total paths in a maze to move from (0,0) to (n,m) using Recursion.
package Java.Recursion;
import java.util.Scanner;
public class Adv_TotalPathsInMatrix_Q25 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Destination Coordinates(n,m) : ");
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println("Total Number of paths from (0,0) to ("+n+","+m+") are = "+countPaths(0,0,n,m));
        
        sc.close();
    }
    public static int countPaths(int i,int j,int n,int m) {
        if(i==n || j==m) {
            return 0;
        }if(i==n-1 && j==m-1) {
            return 1;
        }
        int rightWay=countPaths(i, j+1, n, m);
        int downWay=countPaths(i+1, j, n, m);
        return rightWay+downWay;

    }
}
