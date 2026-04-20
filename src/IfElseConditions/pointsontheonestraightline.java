//package IfElseConditions;
//
//import java.util.Scanner;
//
//public class pointsontheonestraightline {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the point 1 values");
//        int x1 = sc.nextInt();
//        int y1 = sc.nextInt();
//
//        System.out.println("Enter the point 2 values");
//        int x2 = sc.nextInt();
//        int y2 = sc.nextInt();
//
//        System.out.println("Enter the point 3 values");
//        int x3 = sc.nextInt();
//        int y3 = sc.nextInt();
//
//        if (
//                (y2 - y1) / (x2 -x1) == (y3 - y2) / (x3 - x2)
//        )
//        {
//            System.out.println("Points lie one straight line");
//        }
//
//        else {
//            System.out.println("Points not lie one straight line");
//        }
//    }
//}

package IfElseConditions;

import java.util.Scanner;

public class pointsontheonestraightline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the point 1 values");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the point 2 values");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter the point 3 values");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check collinearity using cross multiplication
        if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)) {
            System.out.println("Points lie on one straight line");
        } else {
            System.out.println("Points do not lie on one straight line");
        }

        sc.close();
    }
}
