import java.util.Scanner;

public class Baitap_1 {
    static boolean[] a = new boolean[100000000];
    static void snt(int n) {
        a[0] = a[1] = false;
        for (int i = 2; i <= n; i++) {
            a[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (a[i]) {
                for (int j =2*i; j <= n; j+=i) {
                    a[j] = false;
                }
            }
        }
    }
    static int pt (int n) {
        snt(n);
        int sum = 0, m = n;
        for (int i = 2; i <= n; i++) {
            while (a[i] && m % i == 0 ) {
                sum += i;
                m /= i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += pt(arr[i]);
        }
        System.out.println(sum);
        sc.close();
    }
}