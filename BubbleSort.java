//Bubble sort algorithm - Positive & negative integers!
class BubbleSort{
	public static int[] bubbleSort(int[] input){
		if(input.length <= 1){
			System.out.println("Size is 0 or 1");
			return input;
		}
		boolean flag = false;
		while(!flag){
			flag = true;
			for(int i=0;i<input.length;i++){
				if(i+1 < input.length && input[i+1]<input[i]){
					flag = false;
					int temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}
		}
		return input;
	}	
	public static void printArray(int[] input){
		System.out.println("PRINTING ARRAY:");
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	public static void main(String[] args){
		int[] input = {5,5,4,3,2,1,0,-1,-2,-1};
		int[] input1 = {};
		int[] input2 = {0};
		int[] output = bubbleSort(input2);
		printArray(output);
	}
}