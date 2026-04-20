package IfElseConditions;

import java.util.Scanner;

public class sideoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side1 of the triangle : ");
        int side1 = sc.nextInt();

        System.out.println("Enter the side2 of the triangle : ");
        int side2 = sc.nextInt();

        System.out.println("Enter the side3 of the triangle : ");
        int side3 = sc.nextInt();

        // Check if valid triangle
        if (side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1) {

            System.out.println("Valid Triangle");

            // Check Right-angled triangle
            if (side1*side1 == side2*side2 + side3*side3 ||
                    side2*side2 == side1*side1 + side3*side3 ||
                    side3*side3 == side1*side1 + side2*side2) {

                System.out.println("Right-angled Triangle");
            } else {
                System.out.println("Not a Right-angled Triangle");
            }

        } else {
            System.out.println("Not a Triangle");
        }

        sc.close();
    }
}