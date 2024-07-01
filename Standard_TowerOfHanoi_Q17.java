//Q17 : W.A.P to Implement the Tower of Hanoi using Recursion.
package Java.Recursion;
import java.util.Scanner;
public class Standard_TowerOfHanoi_Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of the Disk: ");
        int n=sc.nextInt();
        towerOfHanoi(n,"Source","Helper","Destination");
        sc.close();
    }
    public static void towerOfHanoi(int n,String sor,String hel,String dest) {
        if(n==1) {
            System.out.println("Transfer disk "+n+" from "+sor+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, sor, dest, hel);
        System.out.println("Transfer disk "+n+" form "+sor+" to "+dest);
        towerOfHanoi(n-1, hel, sor, dest);
    }
}
