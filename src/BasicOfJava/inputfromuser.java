package BASICoFjAVA;
import java.util.Scanner;



public class inputfromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Enter the number: ");
 
        x = sc.nextInt();
        int y = x*x;
        System.out.println("Suare of the given  :"+y);

    }
}
