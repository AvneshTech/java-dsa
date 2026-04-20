package Arrays;

public class productofelement {
    public static void main(String[] args) {
        int [] arr = {4,54,33,1};
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {

            pro *= arr[i];
        }
        System.out.println(pro);

    }
}
