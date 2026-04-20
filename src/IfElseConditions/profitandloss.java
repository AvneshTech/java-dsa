package IfElseConditions;
import java.util.Scanner;

public class profitandloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price");
        int cost = sc.nextInt();
        System.out.println("Enter the Selling Price");
        int selling = sc.nextInt();

        if(cost<selling){
            int profit = selling-cost;
            System.out.println("Your profit is "+profit);
        }
        else if (cost>selling) {
            int loss = cost-selling;
            System.out.println("Your loss is "+loss);
        }
        else{
            System.out.println("No Loss No Profit");

       }
    }
}
