package myproject1;

import java.util.Arrays;

public class duplicateharecter {

	public static void main(String[] args) {
	String S="abbcdde";
	int index=0;
	char ch[]=S.toCharArray();
	
	for(int i=0;i<ch.length;i++)
	{
      boolean repeated=true;
      for(int j=i+1;j<ch.length;j++)
      {if(ch[i]==ch[j])
      {
    	  break;
      }
      }
	
	if(!repeated)
	{
		 ch[index++]=ch[i];
		
	
	}
	
	}
System.out.println(String.valueOf((Arrays.copyOf(ch, index))));
	}
}
