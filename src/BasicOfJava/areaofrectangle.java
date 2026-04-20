package BASICoFjAVA;
import java.util.Scanner;

public class areaofrectangle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length: ");
    double length=sc.nextDouble();
    System.out.println("Enter the width: ");
    double width=sc.nextDouble();
    double area=length*width;
    System.out.println("Area of Rectangle "+area);
    double perimeter =  2*(length+width);
    System.out.println("Perimeters of the rectangle "+perimeter);

    if(area<=perimeter){
        System.out.println("Area is Less than perimeter");

    }
    else{
        System.out.println("Area is Greater than perimeter");
    }
}
}
