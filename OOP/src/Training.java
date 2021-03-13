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
    static boolean validPhoneNumber(String phone) {
        try {
            int i = Integer.parseInt(phone);
            if ((int) (i/1e9) != 0 || i % 10 == 4 || i % 10 == 7 || i % 10 == 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    static boolean checkSpecialNumber(long n) {
        if ((int)(n / 1e10) != 0) {
            return false;
        }
        ArrayList<Long> a = new ArrayList<Long>();
        while (n > 0) {
            a.add(n % 10);
            n /= 10;
        }
        Collections.sort(a);
        for (int i = 0; i < a.size() - 1; i++) {
            if(a.get(i) == a.get(i + 1)) return false;
        }
        return true;
    }
    static boolean uglyNumber(long n) {
        if( n == 0 ||n == 1) return false;
        while(n % 2 == 0) {
            n /= 2;
        }
        while(n % 3 == 0) {
            n /= 3;
        }
        while(n % 5 == 0) {
            n /= 5;
        }
        if (n == 0) return true;
        else return false;
    }
    static int multiplicationOfLuckynumber(long n) {
        ArrayList<Long> a = new ArrayList<Long>();
        while (n > 0) {
            a.add(n % 10);
            n /= 10;
        }
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) == 4) return -1;
        }
        if((a.get(0)*a.get(a.size() - 1)) % 10 == 4) return -1;
        else return (int) (a.get(0)*a.get(a.size() - 1));
    }
    static boolean primeSquare(long a, long b) {
        int n = (int) (a*a - b*b);
        boolean[] snt = new boolean[10000000];
        snt[0] = snt[1] = false;
        for (int i = 2; i <= n; i++) {
            snt[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (snt[i]) {
                for (int j = 2*i; j <= n; j+=i) {
                    snt[j] = false;
                }
            }
        }
        return snt[n];
    }
    static String createPhoneNumber(int[] arr) {
            String sdt = "(";
            for (int i = 0; i < 3; i++) {
                sdt += String.valueOf(arr[i]);
            }
            sdt += ") ";
            for (int i = 3; i < arr.length; i++) {
                if (i == 6) {
                    sdt += ("-" + String.valueOf(arr[i]));
                }
                else sdt += String.valueOf(arr[i]);
            }
            return sdt;
    }
    static int checkNumber(String s) {
        try {
            double l = new Double(s);
            return 1;
        } catch (Exception e) {
            //TODO: handle exception
            return -1;
        }
    }
    public static void main(String[] args) {
        // int arr[] = {19, 17, 19, 68, 68};
        // System.out.println(uniqueNumber(arr));
        // int x = 1000, y = 50, s = 2000;
        // System.out.println(promotion(x, y, s));
        // System.out.println(promotion(x, y, s));
        // String phone = "0966533533";
        // System.out.println(validPhoneNumber(phone));
        // long n = 923567786;
        // System.out.println(multiplicationOfLuckynumber(n));
        int[] arr = {1,2,3,4,3,4,7,8,3,0};
        System.out.println(createPhoneNumber(arr));
        System.out.println(checkNumber("12e3.24"));
    } 
}
