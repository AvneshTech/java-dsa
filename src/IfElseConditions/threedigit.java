package IfElseConditions;
import java.util.Scanner;

public class threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num>99 && num<1000){
            System.out.println("Given number is three digits");
        }
        else {
            System.out.println("Given number is not three digits");
        }
    }

}
