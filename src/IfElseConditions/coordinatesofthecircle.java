package IfElseConditions;

import java.util.Scanner;

public class coordinatesofthecircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 2, y = 3, r = 6;

        System.out.println("Enter the point:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int OA = (x - x1)*(x - x1) + (y - y1)*(y - y1);

        if (OA == r*r) {
            System.out.println("Point lies ON the circle");
        }
        else if (OA > r*r) {
            System.out.println("Point lies OUTSIDE the circle");
        }
        else {
            System.out.println("Point lies INSIDE the circle");
        }

        sc.close();
    }
}