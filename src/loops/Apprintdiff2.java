package loops;
import java.util.Scanner;

public class Apprintdiff2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 4; i<=3*n+1; i=i+3){
            System.out.print(i+" ");
        }

    }
}
