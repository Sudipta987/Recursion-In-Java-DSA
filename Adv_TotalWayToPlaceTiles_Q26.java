//Q26 : W.A.P to Find the total no of ways to place Tiles of size 1*m in a floor of size n*m .
package Java.Recursion;
import java.util.Scanner;
public class Adv_TotalWayToPlaceTiles_Q26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total size of the floor(n*m): ");
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println("Total numbers of Ways to place Tiles for "+n+"*"+m+" floor are: "+placeTiles(n, m));
        sc.close();
    }
    public static int placeTiles(int n,int m) {
        if(n==m) {
            return 2;
        }
        if(n<m) {
            return 1;
        }
        //vertically 
        int verPlace=placeTiles(n-m, m);
        //Horizontally
        int horPlace=placeTiles(n-1, m);
        return verPlace+horPlace;
    }
}
