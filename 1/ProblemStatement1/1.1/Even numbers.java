package work;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		int n; 
		Scanner scan = new Scanner(System.in);
				n=scan.nextInt();
				for(int i=1;i<=n;i++)
				if(i%2==0)
					System.out.println(i);
				
		

	}

}
