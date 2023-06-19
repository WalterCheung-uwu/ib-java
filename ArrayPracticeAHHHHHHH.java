
public class ArrayPracticeAHHHHHHH {
	
	public static double maxArray (int[] array) {
		double MAX = 0.0;
		for(int k = 0; k < array.length; k++)
			if(MAX < array[k])
			MAX = array[k];
		return MAX;
		}
		
	public static double minArray (int[] array) {
		double MIN = 9999999.0;
		for(int l = 0; l < array.length; l++)
			if(MIN > array[l])
			MIN = array[l];
		return MIN;
		}
	
	public static double averageArray (int[] array) {
		double sum = 0.0;
		double average = 0.0;
		for(int j = 0; j < array.length; j++){
			sum = sum + array[j];
			}
			average = (sum / array.length);
		return average;
	}
	
	public static int abvAverage (int[] array) {
		int amtABOVE = 0;
		double average = averageArray(array);
		for(int i = 0; i < array.length; i++){
			if(array[i] > average)
			amtABOVE = amtABOVE + 1;
			}
		return amtABOVE;
		}
		
	public static int belAverage (int[] array) {
		int amtBELOW = 0;
		double average = averageArray(array);
		for(int i = 0; i < array.length; i++){
			if(array[i] < average)
			amtBELOW = amtBELOW + 1;
			}
		return amtBELOW;
		}
		
	public static void smallest (int[] array, int howMany) {
		
	}

	public static void main (String[] args) {
		System.out.println("MISS KATE WANG NUTTAPAT");
		
		int num[] = {163, 491, 211, 5, 509, 17, 313, 197, 7, 31, 97, 4, 131, 223, 463, 331, 107, 59, 293, 337, 461, 191, 233, 277, 71, 109, 241, 61, 29, 503, 367, 449, 89, 431, 389, 139, 269, 263, 47, 349, 257, 67, 2, 11, 251, 227, 457, 193, 383, 359, 379, 83, 173, 409, 239, 151, 311, 13, 113, 443, 419, 281, 181, 487, 53, 103, 179, 43, 479, 149, 199, 19, 283, 307, 23, 439, 271, 373, 167, 73, 421, 101, 401, 37, 353, 521, 433, 41, 523, 499, 347, 127, 157, 3, 79, 467, 229, 397, 137, 317};	
			
			System.out.println("Array Length: " + num.length);
			System.out.println("");
			for(int i = 0; i < num.length - 1; i++){
				System.out.print(num[i] + ", ");
				}
				System.out.print(num[num.length - 1]);
				System.out.println("");
				System.out.println("");
				
				int n = IBIO.inputInt("Input amount of largest and smallest numbers to find: ");
				while(n < 2 || n > 10){
					n = IBIO.inputInt("Input a number between 2 to 10: ");
					}
				
				System.out.println("Results:");
				double MIN = minArray(num);
				System.out.println("Minimum = " + MIN);
				double MAX = maxArray(num);
				System.out.println("Maximum = " + MAX);
				double average = averageArray(num);
				System.out.println("Average = " + average);
				int above = abvAverage(num);
				System.out.println("Numbers above average = " + above);
				int below = belAverage(num);
				System.out.println("Numbers below average = " + below);
	}
}

