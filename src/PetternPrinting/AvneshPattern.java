package PetternPrinting;
import java.util.Scanner;

public class AvneshPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int mid = (n / 2) + 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 2*n - 1; j++) {

                // Left diagonal
                if(j == n - i + 1) {
                    System.out.print("*");
                }
                // Right diagonal
                else if(j == n + i - 1) {
                    System.out.print("*");
                }
                // Middle line
                else if(i == mid && j > n - i + 1 && j < n + i - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}