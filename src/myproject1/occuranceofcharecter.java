package myproject1;

public class occuranceofcharecter {

	public static void main(String[] args) {
		String s="my java program";
		int lengthogstring=s.length();
		int afterremovinga=s.replace("a","").length();
		int count=lengthogstring-afterremovinga;
		System.out.print(count);

	}

}
