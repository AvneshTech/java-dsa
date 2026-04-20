package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,4,8,9,67,34};
        int n = arr.length;
        int i = 0, j = n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}
