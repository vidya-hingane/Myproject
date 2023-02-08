package myproject1;

public class mypractices {

	public static void main(String[] args) {
   
		String str="welcome to java";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{if((ch[i]==ch[j])&&ch[i]!=' ')
			{
				count++;
			}
			}
			
		
		if(count>1 && ch[i]!=' ')
		{
			System.out.print(ch[i]);
		}
}
}

}


		
	
	

	

	


