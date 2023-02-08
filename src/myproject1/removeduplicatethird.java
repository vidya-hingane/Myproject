package myproject1;

public class removeduplicatethird {

	public static void main(String[] args) {
	String str="accbbdas";
	int count=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
      for(int j=i+1;j<ch.length;j++)
      {
    	  if (ch[i]==ch[j])
    	  {
    		  System.out.println("duplicate charecter "+ch[j]);
    	  count++;
    	  }
      }
    	  
      }
	System.out.print("duplicate charcte count:"+count);
	}

}
