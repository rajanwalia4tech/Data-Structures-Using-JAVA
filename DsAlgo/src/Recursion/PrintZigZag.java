package Recursion;
import java.util.*;
public class PrintZigZag {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n) {
    	
        if(n == 0)
            return ;
        System.out.println("PRE" +n);
        pzz(n-1);
        System.out.println("IN" + n);
        pzz(n-1);
        System.out.println("POST"+n);
    }

}
