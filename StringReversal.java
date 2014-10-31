class StringReversal{

	/*
	@author - vin
	Code - Iterative approach for reversing a string using 2 pointer; start and tail pointer and a temp buffer to perform swaping
	Time - O(n)
	Space - O(n) as we need to store the input String as char[]
	Essential condition - iterate until the pointers meet
	*/
	public static String reverseString(String s){
		if(s != null){
			char[] charArr = s.toCharArray();
			int tail = charArr.length - 1;
			int start = 0;
			char buf;
			while(tail>start){
				buf = charArr[start];
				charArr[start] = charArr[tail];
				charArr[tail] = buf;
				tail--;
				start++;
			}
			return new String(charArr);
		}
		return null;
	}

	/*
	@author - vin
	Code - Recursive approach for reversing a string. n levels of recursion
	Time - O(n)
	Space - O(n) due to n levels of recursion
	Essential condition - base condition is when string length <= 1
	*/
	public static String reverseStringRecursive(String s){
		
		//null pointer check
		if(s == null){
			return null;
		}

		//base condition
		if(s.length() <= 1){
			return s;
		}
		return reverseStringRecursive(s.substring(1)) + s.charAt(0);

	}
	public static void main(String[] args){

		//Tester code
		System.out.println("INPUT:");
		// System.out.println(reverseString(null));
		System.out.println("ajbdgbflgkj");
		System.out.println("8kdghj");
		System.out.println("_!vsd2gco $ ");


		System.out.println("TEST - Itr approach");
		System.out.println(reverseString(""));
		// System.out.println(reverseString(null));
		System.out.println(reverseString("ajbdgbflgkj"));
		System.out.println(reverseString("8kdghj"));
		System.out.println(reverseString("_!vsd2gco $ "));


		System.out.println("TEST - recur approach");
		System.out.println(reverseStringRecursive(""));
		// System.out.println(reverseString(null));
		System.out.println(reverseStringRecursive("ajbdgbflgkj"));
		System.out.println(reverseStringRecursive("8kdghj"));
		System.out.println(reverseStringRecursive("_!vsd2gco $ "));
	}
}