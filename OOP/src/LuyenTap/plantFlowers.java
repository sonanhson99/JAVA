package LuyenTap;

public class plantFlowers {
    public static void main(String[] args) {
        int dem = 0;
        int a[] = {1, 0, 0, 0, 0, 0, 0, 1 ,0, 1, 0, 0};
        int[] arr = new int[a.length+2];
        arr[0] = arr[arr.length - 1] = 0;
        for (int i = 0; i < a.length; i++) {
            arr[i + 1] = a[i];
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i+1] == 0 && arr[i+2] == 0) {
                arr[i + 1] = 1;
                dem++;
            }
        }
        System.out.println(dem);
    }
}
