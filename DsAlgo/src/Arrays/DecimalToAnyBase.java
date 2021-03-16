package Arrays;
import java.util.*;
public class DecimalToAnyBase {
	  public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      long dn = getValueInBase(n, b);
	      System.out.println(dn);
	   }
	  
	   public static long getValueInBase(int n, int b){
	       long pow =1;
	       int rem=0;
	       long con =0;
	        while(n>0)
	        {
	            rem = n%b;
	            n/=b;
	            con += rem*pow;
	            pow*=10;
	        }
	        return con;
	   }
}
