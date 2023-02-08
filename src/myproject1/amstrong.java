package myproject1;

public class amstrong {

	public static void main(String[] args) {
		int num=153;
		int rem;
		int amongnum=0;
		int temp=num;
		while(num>0)
		{rem=num%10;
		amongnum=(int) (amongnum+Math.pow(rem,3 ));
		num=num/10;
		}
		System.out.print(amongnum);
		if(temp==amongnum)
			System.out.print("number is amstrong");
		else
			System.out.print("number is not amstrong");
		}


	}


