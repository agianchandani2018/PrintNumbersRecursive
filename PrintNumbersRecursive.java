/**
* @author Ami Gianchandani
*
*
*/


public class PrintNumbersRecursive
{
	public static void main(String[] args)
	{
	
	//printNum(5);
	
	//printNumRec(5);
	//printNumRec(0);
	
	pNR(5);
	pNR(0);
	
	}
	
		/**
		* This method prints the integers from 
		* 0 to n, both inclusive on separate lines
		* using recursion
		* 
		* @param n the largest integer printed on the screen.
		*/	
	
	public static void printNum(int n)
	{
		for (int i = 0; i <= n; i ++)
		System.out.println(i);

	}


	public static void printNumRec (int n)
	{
		if (n == 0)
			System.out.println(0);
		else
		{
		//	System.out.println(' ');
		//	System.out.println ("testing");
			printNum(n - 1);
		}	
		
		System.out.println(n);

	}
	public static void pNR (int n)
	{
		if (n > 0)
			pNR(n - 1);
			
		System.out.println(n);
	
	}
	
	


}