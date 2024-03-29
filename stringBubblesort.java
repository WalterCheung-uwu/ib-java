import java.util.Arrays;  

public class stringBubblesort {
	
	public static void bubSort (String[] array){
		for(int i = 0; i < array.length - 1; i++){
			for(int j = 0; j < array.length - i - 1; j++){
				if(array[j].compareTo(array[j + 1]) > 0){
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					System.out.println(Arrays.toString(array));  
					}
				}
			}
		}
	
	public static void main (String[] args){
		String[] array = {"Dan", "Temmie", "Carol", "Ray", "Abby", "Kara", "Gaby"};
		
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(array));
		System.out.println("");
		System.out.println("Bubble Sort:");
		bubSort(array);
		System.out.println("");
		System.out.println("Final Array:");
		System.out.println(Arrays.toString(array));  
	}
}
