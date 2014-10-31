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
	public static void main(String[] args){

		//Tester code
		System.out.println(reverseString(""));
		// System.out.println(reverseString(null));
		System.out.println(reverseString("ajbdgbflgkj"));
		System.out.println(reverseString("8kdghj"));
		System.out.println(reverseString("_!vsd2gco $ "));
	}
}