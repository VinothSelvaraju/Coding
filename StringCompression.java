//Code for compressing String
//Time - O(n); Space - O(n)
import java.lang.StringBuilder;
class StringCompression{
	/*
	Code for compressing String with the occurances followed by the char. if the compressed string length > input, output the original string
	Time - O(n)
	Space - O(n), Building the new string and storing the input as char[]
	*/
	public static String compress(String input){
		if(input == null || input.length() == 0 || compressHelper(input).length() >= input.length()){
			return input;
		}
		else{
			return compressHelper(input);
		}
	}
	public static String compressHelper(String input){
		char[] charArr = input.toCharArray();
		char runningChar = charArr[0];
		int count = 0;
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<charArr.length;i++){
			if(runningChar == charArr[i]){
				count++;
			}
			else{
				stringBuilder.append(runningChar);
				stringBuilder.append(count);
				count = 1;
				runningChar = charArr[i];
			}
		}
		stringBuilder.append(runningChar);
		stringBuilder.append(count);
		System.out.println("compressHelper : " + stringBuilder.toString());
		return stringBuilder.toString();
	}
	public static void main(String[] args){
		String out = compress("11hbjkb1112jjjkujjjiooooo");
		if(out == null){
			System.out.println("Compressed output is null");
		}
		else{
			System.out.println("OUTPUT: "+out);
		}
	}
}