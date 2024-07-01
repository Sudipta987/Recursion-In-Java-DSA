//Q27 : W.A.P to Find the number of ways in which we can invite n people to our party 'Single or in Pairs'.
package Java.Recursion;
import java.util.Scanner;
public class Adv_TotalWayToInvitePeople_Q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total numbers of Guests(n): ");
        int n=sc.nextInt();
        System.out.println("Total numbers of ways to invite "+n+" people in party are : "+callGuests(n));
        sc.close();
    }
    public static int callGuests(int n) {
        if(n<=1) {
            return 1;
        }
        int single=callGuests(n-1);
        int pairs=(n-1)*callGuests(n-2);
        return single+pairs;
    }
}
