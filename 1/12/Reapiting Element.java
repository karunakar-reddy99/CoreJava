package Work;

import java.util.*;

public class RepeatingElement
{
    static void printFirstRepeating(int arr[])
    {
        int min = -1;
 
        HashSet<Integer> set = new HashSet<>();
        for (int i=arr.length-1; i>=0; i--)
        {
            if (set.contains(arr[i]))
                min = i;
            else 
                set.add(arr[i]);
        }
        if (min != -1)
          System.out.println("The first repeating element is " + arr[min]);
        else
          System.out.println("There are no repeating elements");
    }
    public static void main (String[] args) throws java.lang.Exception
    {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("enter length of array : ");
    	int[] arr = new int[sc.nextInt()];
        System.out.println("enter array values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }
        printFirstRepeating(arr);
    }
}
