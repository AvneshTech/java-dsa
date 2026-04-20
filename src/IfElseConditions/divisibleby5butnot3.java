package IfElseConditions;
import java.util.Scanner;


public class divisibleby5butnot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num%5==0 && num%3!=0){
            System.out.println("The number is divisible by 5 and not 3");
        }
        else{
            System.out.println("The number is divisible by 5 and 3 or not divisible by both of them");
        }
    }
}
