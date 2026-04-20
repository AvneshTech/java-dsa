package Arrays;

public class basicinput {
    public static void main(String[] args) {
        int [] arr = {2,5,-6,5,4};
        int sum = 0;
        for(int i =0 ;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
