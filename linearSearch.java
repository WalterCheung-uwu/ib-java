
public class linearSearch {
	
	public static void printArray (int[] array){
		for(int i = 0; i < array.length; i++){
			if(i > 0){
				System.out.print(" ");
			}
			System.out.print("[" + i + "]" + ":" + array[i]);
		}
	}
	
	public static void search (int[] array){
		int searchedValue = 69;
		int arrayIndex = 0;
		boolean found = false;
		
		while(arrayIndex < array.length && !found){
			if(array[arrayIndex] == searchedValue){
				found = true;
				}
			else{
				arrayIndex++;
			}
		}
		if(found)
		System.out.println("[" + arrayIndex + "]" + " = " + searchedValue);
	}
	
	public static void main (String[] args){
		int[] array = {44, 3, 89, 69, 42, 1, 9};
		printArray(array);
		System.out.println("");
		System.out.println("");
		search(array);
	}
}
