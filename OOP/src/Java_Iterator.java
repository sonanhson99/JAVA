import java.util.ArrayList;
import java.util.Iterator;

public class Java_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (Integer i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println(a);
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            // Integer i = it.next();
            if (it.next() < 5) {
                it.remove();
            }
        }
        System.out.println(a);
    }
}
