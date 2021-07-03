package fibonacci;

import java.util.*;

public class fibonacciDriver {

	public static int fib(int num)
	{
		if(num<=1)
			return num; 
		return fib(num-1) + fib(num-2);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please the number of fibonnaci ") ; 
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("The fibonacci result is  "+ fib(scan.nextInt())); 

		// end code 1
		 
	}
}

	
