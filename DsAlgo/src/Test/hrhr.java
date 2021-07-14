package Test;
public class hrhr {
public static void main(String []args) {
	
	System.out.println(countVowelStrings(2));
}
public static int countVowelStrings(int n) {
    char vowels[] = {'a','e','i','o','u'};
    return countVowels(n,vowels,'a',"");
}


private static int countVowels(int n,char[] vowels,char mark,String s)
{
    if(n==0 ){
        System.out.println(s+ " ");
        return 0;
    }
    
    int sum = 0;
    int count = 0;
    for(int i=0;i<5;i++){
        if(mark<=vowels[i]){
        	count++;
            sum += (countVowels(n-1,vowels,vowels[i],s+vowels[i]) );
        }
    }
    return sum+count;
}
}