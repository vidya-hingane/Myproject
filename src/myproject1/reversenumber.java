package myproject1;

public class reversenumber {

	public static void main(String[] args) {
		int num=1245;
		int reverse=0;
		while(num>0)
		{int rem=num%10;
		reverse=reverse*10+rem;
		num=num/10;
		
			}
		System.out.print("revers value"+reverse);
			}
}
