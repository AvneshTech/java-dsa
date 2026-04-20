package IfElseConditions;
import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any Real Number");
        int a = sc.nextInt();

        if(a<0){
            a = -(a);
            System.out.println(a);
        }
        else{
            System.out.println(a);
        }
    }
}
