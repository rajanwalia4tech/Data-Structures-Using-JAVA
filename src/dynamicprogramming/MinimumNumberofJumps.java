package dynamicprogramming;

public class MinimumNumberofJumps {


    public static void main(String[] args) throws Exception {
   
     int a[] = {3,3,0,2,1,2};
     int n = a.length;
     System.out.println( climbStairs(0,a,new int[n+1]) );
 }
 
 
   public static int climbStairs(int idx,int []a,int[] memo){
     if(a.length == idx){
         return 0;
     }
     // if(memo[n]!=0)
     //     return 0;
     
     int min = -1 ;
     for(int i=1;i<=a[idx];i++){
         int ans = 0;
         if(idx+i<=a.length){
             ans=climbStairs(idx+i,a,memo);
             min = Math.min(ans,min);
         }
     }
     if(min==-1)
    	 return 0;
     //memo[n] = ans;
     return min+1;
 }

	
}
