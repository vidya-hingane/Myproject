package myproject1;

public class vowel {

	public static void main(String[] args) {
		String str="Welcome";
		
		
		String vowel="";
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u')

				vowel=vowel+str.charAt(j);
			 
			
			
		}
		System.out.println(vowel);
		
	}

}
