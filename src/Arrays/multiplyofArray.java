package Arrays;

public class multiplyofArray {
    public static void main(String[] args) {
        int [] arr = {2,5,6,4,8,9};
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            pro *= arr[i];

        }
        System.out.println(pro);
    }
}
