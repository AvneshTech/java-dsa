package Arrays;
import java.util.Scanner;

public class searchinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the number to search: ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==n){
                flag = true;
                break;
            }
        }
        if(flag==false) System.out.println("Number not found");

        else System.out.println("Number found");

    }
}
