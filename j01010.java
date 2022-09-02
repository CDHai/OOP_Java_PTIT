package test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            cut(n);
        }
    }
    
    public static void cut(String s) {
        String x = "";
        if(s.charAt(0)!='0' && s.charAt(0)!='1' && s.charAt(0)!='8' && s.charAt(0)!='9') {
            System.out.println("INVALID");
        }
        else {
            int i=0;
            while(i < s.length() && s.charAt(i)!='1') i++;
            while(i < s.length()){
                if(s.charAt(i)=='1') x = x + '1';
                else if(s.charAt(i)=='0' || s.charAt(i)=='8' || s.charAt(i)=='9') x = x + '0';
                else{
                    x = "";
                    break;
                }
                i++;
            }
            if(x=="") System.out.println("INVALID");
            else System.out.println(x);
        }
    }
}