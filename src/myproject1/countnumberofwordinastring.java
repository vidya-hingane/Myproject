package myproject1;

public class countnumberofwordinastring {

	public static void main(String[] args) {
	String str="welcom to java";
	
	int count=1;
	for(int i=0;i<str.length()-1;i++)
	{ if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
		{
		count++;
		
		}
		
		
	}
System.out.print(count);
	}

}
