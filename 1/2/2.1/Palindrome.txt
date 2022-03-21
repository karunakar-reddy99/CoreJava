package work;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String str,rev ="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		str = scan.nextLine();
		int n= str.length();
		System.out.println("length of a string is " +n);
		str = str.toUpperCase();
		System.out.println(str);
		for(int i=n-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
