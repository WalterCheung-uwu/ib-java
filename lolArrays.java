

public class lolArrays {
	
	public static int maxArray (int[] Array) {
		int MAX = 0;
		for(int i = 0; i < Array.length; i++){
			if(MAX < Array[i])
			MAX = Array[i];
			}
		return MAX;
		}
		
	public static int minArray (int[] Array) {
		int MIN = 999999999;
		for(int i = 0; i < Array.length; i++){
			if(MIN > Array[i])
			MIN = Array[i];
			}
		return MIN;
		}
	
	public static double AvgArray (int[] Array) {
		double average = 0.0;
		double sum = 0.0;
		for(int i = 0; i < Array.length; i++){
			sum = sum + Array[i];
			}
			average = (sum / Array.length);
		return average;
		}
		
	public static int AbvAverage (int[] Array) {
		int above = 0;
		double average = AvgArray(Array);
		for(int i = 0; i < Array.length; i++){
			if(Array[i] > average)
			above = above + 1;
			}
		return above;
		}
		
	public static int BelAverage (int[] Array) {
		int below = 0;
		double average = AvgArray(Array);
		for(int i = 0; i < Array.length; i++){
			if(Array[i] < average)
			below = below + 1;
			}
		return below;
		}
	
	public static void main (String[] args) {
		int num[] = {163, 491, 211, 5, 509, 17, 313, 197, 7, 31, 97, 4, 131, 223, 463, 331, 107, 59, 293, 337, 461, 191, 233, 277, 71, 109, 241, 61, 29, 503, 367, 449, 89, 431, 389, 139, 269, 263, 47, 349, 257, 67, 2, 11, 251, 227, 457, 193, 383, 359, 379, 83, 173, 409, 239, 151, 311, 13, 113, 443, 419, 281, 181, 487, 53, 103, 179, 43, 479, 149, 199, 19, 283, 307, 23, 439, 271, 373, 167, 73, 421, 101, 401, 37, 353, 521, 433, 41, 523, 499, 347, 127, 157, 3, 79, 467, 229, 397, 137, 317};
		
		System.out.println("Array length: " + num.length);
		System.out.println("");
		for(int i = 0; i < num.length; i++){
		System.out.print(num[i] + " | ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Results:");
		int max = maxArray(num);
		System.out.println("Maximum = " + max);
		int min = minArray(num);
		System.out.println("Minimum = " + min);
		System.out.println("Range = " + (max - min));
		double average = AvgArray(num);
		System.out.println("Average = " + average);
		int above = AbvAverage(num);
		System.out.println("Numbers above average = " + above);
		int below = BelAverage(num);
		System.out.println("Numbers below average = " + below);
	}
}

