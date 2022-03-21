package work;
import java.util.*;
public class ClimbingStairs {
	
	 static int climbStairs(int N){
		    if ( N < 2 )
		        return 1;
		    else
		        return climbStairs(N-1) + climbStairs(N-2);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of steps");
		int steps=sc.nextInt();
		System.out.println("The total number of ways to climb "+steps+" stairs is : "+climbStairs(steps));

	}

}

