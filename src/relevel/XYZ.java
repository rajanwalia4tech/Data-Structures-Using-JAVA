import java.util.*;
public class XYZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt(); // 8
        int y = sc.nextInt(); // 12
        int z = sc.nextInt(); // 8 -> [1, 4]
        int min = Math.min(Math.min(x,y),z);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=2;i<=min;i++){
            if(isDivisible(x,y,z,i))
                ans.add(i);
        }
        System.out.print(ans.size());
    }

    public isDivisible(int x,int y,int z,int n){
        if(x%n==0 && y%n==0 && z%n==0) return true;
        return false;
    }

}

/*
Amy likes the number a X, Anne likes the number Y and Emmy likes the number Z.
We define an array “favourable” array when it follows all the below properties:
· Each element of the array is divisible by all the three integers X, Y and Z.
· All the elements of the array are pairwise coprime.
Find the maximum length of the favourable array you can make, for the given value of X, Y and Z.
You are given T independent test cases.

 */