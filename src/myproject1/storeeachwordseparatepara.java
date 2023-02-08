package myproject1;

public class storeeachwordseparatepara {

	public static void main(String[] args) {
	String str="welcom to java";
	//String str1[]=str.split( " ",2);
	//String str2[]=str.split( " ",3);
	//String str3[]=str.split( " ",4);
	
	//System.out.println(str1[0]);
	//System.out.println(str2[1]);
	//System.out.println(str3[2]);
		
	String str1[]=str.split(" ");
	for(int i=0;i<str1.length;i++)
	{
		System.out.println(str1[i]);
	}
	
	
			

	}

}
