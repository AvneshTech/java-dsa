package loops;
import java.util.Scanner;

public class tableofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i = n; i<=10*n; i=i+n)
        {
            System.out.print(i+" ");
        }
    }
}
