package Arrays;
import java.util.*;
public class AnyBaseToDecimal {

	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int d = getValueIndecimal(n, b);
	      System.out.println(d);
	}
   public static int getValueIndecimal(int n, int b){
	       int rem = 0;
	       int pow =1;
	       int con =0;
		  while(n>0){
		      rem = n%10;
		      n/=10;
		      con+= rem*pow;
		      pow*=b;
		      
		  }
		  
	      return con;
	   }
}
