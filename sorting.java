
public class sorting {
	
	public static void printArray (int[] array){
		for(int i = 0; i < array.length; i++){
			if(i > 0){
				System.out.print(" ");
			}
			System.out.print("[" + i + "]" + ":" + array[i]);
		}
	}
	
	public static void swapArray (int[] array){
		int smallest = 999999999;
		int index = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] < smallest){
				smallest = array[i];
				}
			}
			
			int temp = smallest;
			smallest = array[index];
			array[index] = temp;
			
			for(int i = 0; i < array.length; i++){
			if(i > 0){
				System.out.print(" ");
			}
			System.out.print("[" + i + "]" + ":" + array[i]);
		}
	}
	
	public static void main (String[] args){
		int[] array = {69, 15, 76, 42, 2, 9};
		printArray(array);
		System.out.println("");
		System.out.println("");
		swapArray(array);
	}
}
