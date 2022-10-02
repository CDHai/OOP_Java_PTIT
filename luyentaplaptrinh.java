import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class ThiSinh implements Comparable<ThiSinh> {
    String ten;
    int ac;
    int submit;

    ThiSinh(String ten, int ac, int submit) {
        this.ten = ten;
        this.ac = ac;
        this.submit = submit;
    }

    public int compareTo(ThiSinh o) {
        if (this.ac != o.ac) {
            return o.ac - this.ac;
        }
        if (this.submit != o.submit) {
            return this.submit - o.submit;
        }
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ten + " " + ac + " " + submit;
    }
}

public class Luyentaplaptrinh {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = sc.nextInt();
        ArrayList<ThiSinh> list = new ArrayList<ThiSinh>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            int ac = sc.nextInt();
            int submit = sc.nextInt();
            list.add(new ThiSinh(ten, ac, submit));
        }
        Collections.sort(list);
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
        sc.close();
    }
}
