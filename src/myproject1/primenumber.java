package myproject1;

public class primenumber {

	public static void main(String[] args) {
		int num=6;
		int count=0;
		for(int i=1;i<=num;i++)
			{if(num%i==0)
			
				count++;
			}
			if(count==2)
		{
		System.out.print("number is prime");	
		
		}
		else 
		{
			System.out.print("number is not prime");
		}
	}

}
