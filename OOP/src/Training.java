import java.util.ArrayList;
import java.util.Collections;

public class Training {
    static int minMax(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (n > 0) {
            a.add(n % 10);
            n /= 10;
        }
        Collections.sort(a);
        int h = 0, k = 0;
        for (int i = 0; i < a.size(); i++) {
            h = h*10 + a.get(i);
            k = k*10 + a.get(a.size() - 1 - i);
        }
        return k - h;
    }
    static int uniqueNumber(int[] arr) {
        boolean[] a = new boolean[arr.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = true;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] ) {
                for (int j = i + 1; j < a.length; j++) {
                    if (arr[i] == arr[j]) a[i] = a[j] = false;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]) return arr[i];
        }
        return -1;
    }
    static int promotion(int x, int y, int s) {
        if(s <= x) return s;
        if(s <= x + y) return x;
        return (s/(x + y))*x + s % (x + y);
    }
    public static void main(String[] args) {
        // int arr[] = {19, 17, 19, 68, 68};
        // System.out.println(uniqueNumber(arr));
        int x = 1000, y = 50, s = 2000;
        System.out.println(promotion(x, y, s));
        System.out.println(promotion(x, y, s));
    } 
}
