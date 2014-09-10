//Selection sort algorithm
//Nested for; linear scan in each turn for the iterator
class SelectionSort{
	public static int[] selectionSort(int[] input){
		if(input.length <= 1){
			System.out.println("Size is 0 or 1");
			return input;
		}
		for(int i=0;i<input.length;i++){
			//int min = input[i];
			for(int j=0;j<input.length;j++){
				if(input[j]>input[i]){
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					//min = input[j];
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
		int[] input = {5,5,4,1,3,2,1,0,-1,-2,-1};
		int[] input1 = {};
		int[] input2 = {0};
		int[] output = selectionSort(input);
		printArray(output);
	}
}