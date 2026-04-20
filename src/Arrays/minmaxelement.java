package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class minmaxelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int min , max;
        int i;
        // if array size is even
        if (arr.length %2 == 0){
            if(arr[0] < arr[1]){
                min = arr[0];
                max = arr[1];
            }
            else{
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        }
        else
        {
            min = max = arr[0];
            i = 1;
        }

        //main process for checking every element in the array
        while(i < arr.length - 1){
            if(arr[i] < arr[i+1]){
                if (arr[i] < min) min = arr[i];
                if (arr[i+1] > max) max = arr[i+1];

            }
            else {
                if (arr[i+1] < min) min = arr[i+1];
                if (arr[i] > max) max = arr[i];
            }
            i += 2;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        System.out.println(list);


    }
}
