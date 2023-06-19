
public class bubbleSort {
	
	public static void printArray (int[] array) {
		for(int i = 0; i < array.length; i++){
			if(i > 0){
				System.out.print(" ");
				}
			System.out.print("[" + i + "]" + ":" + array[i]);
			}
		}
	
	public static void bubble (int[] array) {
		for(int i = 0; i < array.length - 1; i++){
			for(int j = 0; j < array.length - i - 1; j++ ){
				if(array[j] > array[j + 1]){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					for(int k : array){
						System.out.print(k + " ");
						}
						System.out.println("");
					}
				}
			}
		}
	
	public static void main (String[] args) {
		int[] array = {4, 5, 2, 8, 9, 10, 1, 3, 6, 7};
		
		bubble(array);
	}
}

