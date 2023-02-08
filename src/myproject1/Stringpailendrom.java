package myproject1;

public class Stringpailendrom {

	public static void main(String[] args) {
	String str="mom";
	String temp=str;
	int length=str.length();
	String rev="";
	
	for(int i=length-1;i>=0;i--)
	
		rev=rev+str.charAt(i);
	
	
		if(temp.equals(rev))
		
			System.out.print("String is pailendrom");
		
			
		else
		
			System.out.print("String is not pailendrom");
		
		
	}
	
	

	}


