package LuyenTap;

public class plantFlowers {
    static boolean kt(int[] arr, int n) {
        int[] a = new int[arr.length+2];
        a[0] = a[a.length - 1] = 0;
        for (int i = 0; i < arr.length; i++) {
            a[i + 1] = arr[i];
        }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == 0 && a[i+1] == 0 && a[i+2] == 0) {
                a[i + 1] = 1;
                n--;
            }
        }
        if (n > 0) {
            return false;
        }
        else return true;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 0, 0, 0, 0, 1 ,0, 1, 0, 0};
        System.out.println(kt(arr, 4));
    }
}
