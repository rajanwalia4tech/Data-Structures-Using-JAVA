package dynamicprogramming;

import java.util.Scanner;

// Question link :https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-with-variable-jumps-official/ojquestion


public class ClimbStairswithVariableJumps {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(climbStairs(0,a,new int[n+1]));
    }
    
    public static void dp(int []a,int n){
        
        int dp[]=  new int[n+1];
        dp[n] = 1;
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=a[i];j++){
                if(i+j<=n)
                    dp[i] += dp[i+j];
            }
        }
        System.out.println(dp[0]);
    }
    
    
    
    public static int climbStairs(int idx,int []a,int[] memo){
        if(a.length == idx){
            return 1;
        }
        
        int ans=0;
        for(int i=1;i<=a[idx];i++){
            if(idx+i<=a.length)
                ans+=climbStairs(idx+i,a,memo);
        }
        return ans;
    }

}