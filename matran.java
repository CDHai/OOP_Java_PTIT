package test;

import java.util.*;
import java.io.*;

public class matran {
    public static void main(String args[]) throws FileNotFoundException{
        Scanner in = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[][] a = new int[n+3][m+3];
            ArrayList<Integer> v = new ArrayList<>();
            for(int i = 1; i <= n; i++){
                for(int j = 1;j <= m; j++){
                    a[i][j] = in.nextInt();
                    if(j == x){
                        v.add(a[i][j]);
                    }
                }
            }
            Collections.sort(v);
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if(j != x){
                        System.out.printf("%d ",a[i][j]);
                    }
                    else{
                        System.out.printf("%d ",v.get(0));
                        v.remove(0);
                    }
                }
                System.out.println("");
            }
        }
    }
}
