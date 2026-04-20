package IfElseConditions;

import java.util.Scanner;

public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num%3==0 && num%5==0){
            System.out.println("The number is divisible by 5 and 3");
        }
        else{
            System.out.println("The number is not divisible by 5 and 3");
        }
    }
}
