/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		//System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		//System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			//System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		//System.out.println(pass ? "test passed" : "test Failed");
	}  

	
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		// Replace the following statement with your code
<<<<<<< HEAD
		String anagram=str.toLowerCase();
		String preprocess="";
        for(int i=0;i<anagram.length();i++)
		{
           char c= anagram.charAt(i);
			if(c>='a'&&c<='z')
			  preprocess=preprocess+c;		
		}
		return preprocess;
=======
		return "";
>>>>>>> upstream/main
	} 

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		boolean isanagram=true;
		str1= preProcess(str1);
		str2= preProcess(str2);
		if(str1.length()==str2.length())
		{
		for(int i=0;i<str1.length();i++)
		{
			char c= str1.charAt(i);
			for(int j=0;j<str2.length();j++)
			{
				int n= str2.indexOf(c);
				if(n==(-1))
				 isanagram=false;
			}
		}
		for(int i=0;i<str2.length();i++)
		{
			char c= str2.charAt(i);
			for(int j=0;j<str1.length();j++)
			{
				int n= str1.indexOf(c);
				if(n==(-1))
				 isanagram=false;
			}
		}
	}
	else 
	    isanagram=false;
		return isanagram;
	}
	   
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		// Replace the following statement with your code
<<<<<<< HEAD
		String s="";
		for(int i=0;i<str.length();i++)
		{
			int d=(int)(Math.random()*str.length());
			s=s+str.charAt(d);
			str=deletChar(str, d);
		}
		return s;
	}

	public static String deletChar(String str, int d)
	{
		String n=""; 
		for(int i=0;i<str.length();i++)
			if(i!=d)
              n=n+str.charAt(i); 
		  return n;
=======
		return "";
>>>>>>> upstream/main
	}
}
