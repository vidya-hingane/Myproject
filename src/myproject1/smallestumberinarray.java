package myproject1;

public class smallestumberinarray {

	public static void main(String[] args) {
		int a[]= {50,40,56,20,48};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			}
		System.out.print(min);
		}

	}


