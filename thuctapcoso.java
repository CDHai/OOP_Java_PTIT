import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SinhVien {
    String id;
    String name;
    String phoneNumber;
    String email;

    SinhVien(String id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}

class DeTai {
    String id;
    String giangVien;
    String deTai;

    DeTai(int id, String giangVien, String deTai) {
        this.id = String.format("DT%03d", id);
        this.giangVien = giangVien;
        this.deTai = deTai;
    }
}

class NhiemVu implements Comparable<NhiemVu> {
    SinhVien sv;
    DeTai dt;

    NhiemVu(SinhVien sv, DeTai dt) {
        this.sv = sv;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", sv.id, sv.name, sv.phoneNumber, sv.email, dt.giangVien, dt.deTai);
    }

    @Override
    public int compareTo(NhiemVu o) {
        return this.dt.deTai.compareTo(o.dt.deTai);
    }
}

public class Thuctapcoso {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> svList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String phoneNumber = sc.nextLine();
            String email = sc.nextLine();
            svList.add(new SinhVien(id, name, phoneNumber, email));
        }
        sc = new Scanner(new File("DETAI.in"));
        n = sc.nextInt();
        sc.nextLine();
        ArrayList<DeTai> dtList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String giangVien = sc.nextLine();
            String deTai = sc.nextLine();
            dtList.add(new DeTai(i + 1, giangVien, deTai));
        }
        sc = new Scanner(new File("NHIEMVU.in"));
        n = sc.nextInt();
        ArrayList<NhiemVu> nvList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            String idDeTai = sc.next();
            for (SinhVien sv : svList) {
                if (sv.id.equals(id)) {
                    for (DeTai dt : dtList) {
                        if (dt.id.equals(idDeTai)) {
                            nvList.add(new NhiemVu(sv, dt));
                        }
                    }
                }
            }
        }
        Collections.sort(nvList);
        for (NhiemVu nv : nvList) {
            System.out.println(nv);
        }
        sc.close();
    }
}
