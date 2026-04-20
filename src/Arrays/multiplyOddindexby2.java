package Arrays;

public class multiplyOddindexby2 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,5,8};
        for(int i = 0 ; i<arr.length; i++) {
           if(i%2!=0){
               arr[i] = arr[i]*2;
           } else{
               arr[i] = arr[i]+10;
           }
           System.out.println(arr[i]);
        }
    }
}
