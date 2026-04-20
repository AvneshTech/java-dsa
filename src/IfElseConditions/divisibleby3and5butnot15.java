package IfElseConditions;

import java.util.Scanner;

public class divisibleby3and5butnot15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();

        if ((n % 3 == 0 || n % 5 == 0) && n % 15 != 0)
        {
            System.out.println("This is valid ");

        }
        else {
            System.out.println("This is not valid ");
        }
    }
}
