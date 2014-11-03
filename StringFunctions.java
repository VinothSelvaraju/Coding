class StringFunctions{
	/*
	@author : vin
	Code for checking a String is palindrome or not! - Recursive soln
	Time/Space: O(n)
	*/
	public static boolean isPalindromeRecur(String s){
		if(s == null){
			return false;
		}
		if(s.length() <= 1){
			return true;
		}
		if(s.charAt(0) != s.charAt(s.length()-1)){
			return false;
		}
		return isPalindromeRecur(s.substring(1,s.length()-1));
	}

	/*
	@author : vin
	Code for checking a String is palindrome or not! - Iterative solution
	Time: O(n) Space: O(1)
	*/
	public static boolean isPalindromeIter(String s){
		if(s == null){
			return false;
		}
		if(s.length() <= 1){
			return true;
		}
		int last = s.length()-1;
		int first = 0;
		while(last > first){
			if(s.charAt(first) != s.charAt(last)){
				return false;
			}
			first++;
			last--;
		}
		return true;
	}


	/*
	@author : vin
	Code for removing matched characters from the input strings
	Time: O(n) Space: O(1)
	*/
	public static String removeChar(String s, char c){
		if(s == null || s.isEmpty() || c == '\0'){
			return s;
		}
		char[] charArr = s.toCharArray();
		for(int i=0;i<charArr.length;i++){
			if(charArr[i] == c){
				charArr[i] = '\0';
			}
		}
		return new String(charArr);
	}


	/*
	@author : vin
	Code for printing permutations of a string using recursion
	Time: O(n*n!) Space: O(1)
	*/
	public static void permuteString(String s){
		if(s == null){
			return;
		}
		char[] c = s.toCharArray();
		permuteString(c,0,s.length()-1);
	}
	public static void permuteString(char[] c,int k, int n){
		if(k == n){
			System.out.println(new String(c));
			return;
		}
		else{
			for(int i=k;i<=n;i++){
				c = swap(c,i,k);
				permuteString(c,k+1,n);
				c = swap(c,i,k);
			}
		}
	}
	public static char[] swap(char[] c, int i, int k){
		char t = c[i];
		c[i] = c[k];
		c[k] = t;
		return c;
	}

	public static void main(String[] args){
		System.out.println("----------------------------------------");
		
		System.out.println("****String Palindrome Recursive soln****");
		System.out.println(isPalindromeRecur("malayalam"));
		System.out.println(isPalindromeRecur("abc"));
		System.out.println(isPalindromeRecur("abba"));
		System.out.println(isPalindromeRecur(""));
		System.out.println(isPalindromeRecur(null));


		System.out.println("****String Palindrome Iterative soln****");
		System.out.println(isPalindromeIter("malayalam"));
		System.out.println(isPalindromeIter("abc"));
		System.out.println(isPalindromeIter("abba"));
		System.out.println(isPalindromeIter(""));
		System.out.println(isPalindromeIter(null));

		System.out.println("----------------------------------------");

		System.out.println("****String remove char****");
		System.out.println(removeChar("malayalam",'m'));
		System.out.println(removeChar("malayalam",'a'));
		System.out.println(removeChar("xxxxxxxx",'x'));
		System.out.println(removeChar("abc",'d'));
		System.out.println(removeChar("abba",'\0'));
		System.out.println(removeChar("",'d'));
		System.out.println(removeChar(null,'\0'));

		System.out.println("----------------------------------------");
		System.out.println("****Permute String****");
		System.out.println("Permute String: 123");
		permuteString("123");
		System.out.println("Permute String: null");
		permuteString(null);
		System.out.println("Permute String: abcd");
		permuteString("abcd");
		System.out.println("Permute String:  ");
		permuteString(" ");
	}
}