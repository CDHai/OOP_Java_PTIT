package test;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class kiemtrachiahet {
    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(new File("SONGUYEN.IN"));
        int t = in.nextInt();
        while(t-- >0){
            BigInteger x = in.nextBigInteger();
            BigInteger m = new BigInteger("7");
            BigInteger n = new BigInteger("13");
            BigInteger a = x.divide(m);
            BigInteger b = x.divide(n);
            if(x.compareTo(m.multiply(a)) == 0 && x.compareTo(n.multiply(b)) == 0){
                System.out.println("Both");
            }
            else if(x.compareTo(m.multiply(a)) == 0){
                System.out.println("Div 7");
            }
            else if(x.compareTo(n.multiply(b)) == 0){
                System.out.println("Div 13");
            }
            else System.out.println("None");
        }
    }
}
