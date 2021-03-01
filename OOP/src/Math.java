class Math1 {
    public static double PI = 3.14;
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int min(int x, int y) {
        return x < y ? x : y;
    }
    public static int max(int x, int y) {
        return x < y ? y : x;
    }
    public static int pow(int x , int y) {
        if (y == 1) {
            return x;
        }
        else return x*pow(x, y - 1);
    }
}
