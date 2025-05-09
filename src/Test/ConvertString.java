package Test;

public class ConvertString {

	public static void main(String[] args) {
		String cpp = "my_variable_name";
		String java = "myVariableName";
		String ans = convertVariable(cpp);
		System.out.println(ans);

	}
	
	public static String convertVariable(String var) {
		boolean checkLanguage = false;
		
		//if checkLanguage==true then it is c++ variable otherwise 
		// it is java variable name
		for(int i=0;i<var.length();i++) {
			if(var.charAt(i)=='_')
				checkLanguage = true;
		}
		
		String ans = "";
		
		if(checkLanguage) { // converting in JAVA
			for(int i=0;i<var.length();i++) {
				char curChar = var.charAt(i);
				if(curChar=='_' && i<var.length()-1) {
					ans+= (char)(var.charAt(i+1) - 32);
					i++;
					
				}else {
					ans+= curChar;
				}
					
			}			
		}else {	// coverting in CPP
			
			for(int i=0;i<var.length();i++) {
				char curChar = var.charAt(i);
				if( curChar>=65 && curChar<=90) {
					ans+= "_"+(char)(var.charAt(i) + 32);					
				}else {
					ans+= curChar;
				}
			}	
			
		}
		return ans;
	}
}
