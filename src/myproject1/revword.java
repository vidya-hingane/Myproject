package myproject1;

public class revword {

	public static void main(String[] args) {
String Input="hellow world";
String s[]=Input.split(" ");
String res="";
for(int i=s.length-1;i>=0;i--)
{
	res=res+s[i]+" ";
}
System.out.println(res);
}
}