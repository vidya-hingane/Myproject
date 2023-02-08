package myproject1;

public class copyonestringtoantherwithoutspace {

	public static void main(String[] args) {
	String str="Welcome to java";
	String str1[]=str.split(" ");
	for(int i=0;i<str1.length;i++)
	{
		System.out.print(str1[i]);
	}

	}

}
