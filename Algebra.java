// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		int a= x1;
		int b= x2;
		if(b>0)
		{
		for(int i=0;i<=b;i++)
		{
			a++;
		}
	    }
		else 
		{
	    for(int i=0;i>b;i--)
		{
			a--;
		}
		}
	    
		return a;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		int a= x1;
		int b= x2;
		if(b>0)
		{
		for(int i=0;i<=b;i++)
		{
			a--;
		}
	    }
		else 
		{
	    for(int i=0;i>b;i--)
		{
			a++;
		}
		}
	    
		return a;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
<<<<<<< HEAD
        // Replace the following statement with your code
		int a=0;
		int x1moch=x1;
		int x2moch=x2;
		if(x1<0)
		  x1moch=minus(x1, x1);
		if(x2<0)
		  x2moch=minus(x1, x2);
		for(int i=1;i<x2moch;i++)
		   a=plus(a, x1moch);
		if(x1<0 ^ x2<0)
		   a=minus(x1,a);
		return a;
=======
		// Replace the following statement with your code
		return 0;
>>>>>>> upstream/main
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int count=x;
		for(int i=0;i<n-1;i++)
		  count= times(count,x);
		if(n>0)
		  return count;
		else
		   return 1;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
<<<<<<< HEAD
        // Replace the following statement with your code
		int count=0;
		int x1moch=x1;
		int x2moch=x2;
		if(x1<0)
		  x1moch=minus(x1, x1);
	    if(x1<0)
		  x2moch=minus(x1, x2);
	    int foundx2=x1moch;
		while(foundx2>=x2moch)
		{
           foundx2=minus(foundx2, x2moch);
		   count++;
		}
		if(x1<0 ^ x2<0)
		   count=minus(x1, count);
		return count;
=======
		// Replace the following statement with your code
		return 0;
>>>>>>> upstream/main
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
<<<<<<< HEAD
        // Replace the following statement with your code
		int d, n, t=0;
		if(x1<x2)
		  return x1;
		else
		{
		 d=div(x1,x2);
		 t=times(d, x2);
		 n=minus(x1, t);
		}

		return n;
=======
		// Replace the following statement with your code
		return 0;
>>>>>>> upstream/main
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
<<<<<<< HEAD
        // Replace the following statement with your code
		int n=0;
		for(int i=0;i<x;i++)
		{
		  n=pow(i,2);
		  if(n==x)
		     return n;
		  else
		      if(n>x)
			    return i--;
		}
=======
		// Replace the following statement with your code
>>>>>>> upstream/main
		return 0;
	}	  	  
}