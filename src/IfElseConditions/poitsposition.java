package IfElseConditions;

import java.util.Scanner;

public class poitsposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x and y points values");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x==0 && y==0)
        {
            System.out.println("Points lies on the origin");

        }

        else if (x==0)
        {
            System.out.println("Points lies on the y-axis");
        }

        else if (y==0)
        {
            System.out.println("Points lies on the x-axis");
        }
        else {
            System.out.println("Condition not matches");
        }
    }
}
