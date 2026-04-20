package loops;
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }

        boolean flag = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("Composite number");
        else
            System.out.println("Prime number");
    }
}