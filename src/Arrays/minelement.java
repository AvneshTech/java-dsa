package Arrays;

public class minelement {
    public static void main(String[] args) {
        int [] arr = {2,4,3,5,7,6};
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
