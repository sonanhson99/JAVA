import java.util.Scanner;

public class Java_Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            System.out.println(a);
            sc.close();
        } catch (Exception e) {
            System.out.println("so vua nhap khong phai so nguyen!");
        }
    }
}
