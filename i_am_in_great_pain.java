
public class i_am_in_great_pain {
	
	public static void printArray (int[] array){
		if(array.length > 0){
			for(int index = 0; index < array.length; index++){
				array[index] = IBIO.inputInt("print array " + "#" + (index + 1) + ": ");
				}
				for(int index2 = 0; index2 < array.length; index2++){
				System.out.println("[" + index2 + "]" + array[index2]);
				}
			}
			else{
				System.out.println("no array? *insert megamind face meme*");
				}
		}
		
		
	public static double averageArray (int[] array){
		double average = 0;
		for(int index = 0; index < array.length; index++){
			average = average + array[index];
			}
			average = average / array.length;
			return average;
		}
	
	
	public static void main (String[] args) {
		int x = IBIO.inputInt("Array number: ");
		System.out.println("");
		int[] number = new int[x];
		printArray(number);	
		double average = averageArray(number);
		System.out.println("average = " + average);
	}
}

