
public class elSwap {
	
	public static void printArray (String[] array){
		for(int i = 0; i < array.length; i++){
			if(i > 0){
				System.out.print(", ");
				}
				System.out.print(array[i]);
			}
			System.out.println("");
			System.out.println("");
		}
	
	public static void swapArray (String[] array){
		String temp = array[1];
		for(int i = 0; i < array.length; i++){
			if(i > 0){
				System.out.print(", ");
				}
			if(array[i] == array[1]){
				array[i] = array[array.length - 2];
				array[array.length - 2] = temp;
				}
				System.out.print(array[i]);
			}
		}
	
	public static void main (String[] args){
		String array[] = {"chibai", "lanjiao", "urMom", "qiBaiLanJiao"};
		printArray(array);
		swapArray(array);
	}
}
