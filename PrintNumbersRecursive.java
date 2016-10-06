/**
* @author Ami Gianchandani
* This is a project that prints integers from 0 - n
* each on a separate line
*/


public class PrintNumbersRecursive
{
	public static void main(String[] args)
	{
	
	//printNum(5);
	
	printNumRec(5);
	printNumRec(0);
	
	}
	
	/**
	* This method prints the integers from 
	* 0 to n, both inclusive on separate lines
	* not using recursion
	* @param n the largest integer printed on the screen.
	*/	
	
	public static void printNum(int n)
	{
		for (int i = 0; i <= n; i ++)
		System.out.println(i);
	}


	/**
	* This method prints the integers from 
	* 0 to n, both inclusive on separate lines
	* using recursion
	* if n is greater than 0, it recurses and prints all numbers less than n
	* until all cases reach the line that prints n
	* @param n the largest integer printed on the screen.
	*/	

	//}
	public static void printNumRec (int n)
	{
		if (n > 0)
			printNumRec(n - 1);
			
		System.out.println(n);
	
	}
}