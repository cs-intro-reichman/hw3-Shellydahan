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
		for(int i=0;i<b;i++)
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
		for(int i=0;i<b;i++)
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

        // Replace the following statement with your code
		if (x2 == 0) return 0;
        int a = x1;
		if (x2 > 0){
			for (int i = 1; i < x2; i++){
				x1 = plus(x1, a);
			}
		} else {
			for (int i = 1; i > x2; i--){
				x1 = minus(x1, a);
			}
			
		}
		return x1;

	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int count=x;
		for(int i=1;i<n;i++)
		  x= times(x,count);
		if(n>0)
		  return x;
		else
		   return 1;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {

        // Replace the following statement with your code
		if (x2 == 0) return -1;
		int mana = 0;
		int count = x1;

		if (x1 < 0){
			if (x2 < 0){
				while (x1 <= x2){
					x1 = minus(x1, x2);
					mana++;
				}
				return mana;
			} else {
				x1 = minus(x1, x1);
				x1 = minus(x1, count);
				while (x1 >= x2){
					x1 = minus(x1, x2);
					mana--;
				}
			}
		} else {
			while (x1 >= x2){
				x1 = minus(x1, x2);
				mana++;
			}
		}

		
		return mana;

	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {

        // Replace the following statement with your code
		if(x1<x2)
		  return x1;
		else
		{
			while (x1 >= x2){
				x1 = minus(x1, x2);
			}
			return x1;
		}
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {

        // Replace the following statement with your code
		int n=0;
		while(times(n,n)<=x)
		  n++;
		n-=1;
		return n;

	}	  	  
}