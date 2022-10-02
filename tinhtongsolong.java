package test;

import java.util.*;
import java.io.*;

public class tinhtongsolong {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        long tong1 = 0;
        Long tong = 0L;
        while(in.hasNext()) {
            String s = in.next();
            try {
                tong += Long.parseLong(s);
                tong1 += Integer.parseInt(s);
            } catch (Exception e) {
            }
        }
        System.out.println(tong - tong1);
    }
}
