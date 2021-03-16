package Test;

import java.util.ArrayList;

class pair  {  
    long first, second; 
    Object o;
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class Compute {
    long firstOcc(long v[],long x){
        long low=0,high=v.length-1;
        long res=-1;
        while(low<=high){
            long mid = (low+high)/2;
            if(x<v[(int) mid])
                high= mid-1;
            else if(v[(int) mid]<x)
                low = mid+1;
            else{
                res = mid;
                high = mid-1;
            }
        }
        return res;
    }
    long lastOcc(long v[],long x){
        long low=0,high=v.length-1;
        long res=-1;
        while(low<=high){
            long mid = (low+high)/2;
            if(x<v[(int) mid])
                high= mid-1;
            else if(v[(int) mid]<x)
                low = mid+1;
            else{
                res = mid;
                low = mid+1;
            }
        }
        return res;
    }
    
    public pair indexes(long v[], long x)
    {
        pair p=new pair(firstOcc(v,x),lastOcc(v,x));
        ArrayList a = new ArrayList();
        return p;
    }
}

//pair