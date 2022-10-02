package test;

import java.util.*;
import java.io.*;

public class sokhonggiam {
    
    static int a[] = new int[100000];
    static int b[] = new int[100000];
    
    public static int so(int n) {
        if(n < 10)
            return 0;
        int tmp = 10;
        while(n > 0){
            if(n % 10 > tmp) return 0;
            tmp = n % 10;
            n /= 10;
        }
        return 1;
    }
    
    public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException{
        ObjectInputStream sc = null;
        sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> l = (ArrayList<Integer>) sc.readObject();
        for(int i: l){
            if(so(i)==1){
                a[i]++;
            }
        }
        sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        l = (ArrayList<Integer>) sc.readObject();
        for(int i: l){
            if(so(i)==1){
                b[i]++;
            }
        }
        for(int i = 0; i < 100000; i++){
            if(a[i] > 0 || b[i] > 0){
                System.out.println(i + " " + a[i] + " " + b[i]);
            }
        }
    }
}
