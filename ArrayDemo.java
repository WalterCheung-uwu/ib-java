
public class ArrayDemo {
	
	public static void printArray(int[] a){
		if(a.length > 0){
			for(int i = 0; i < a.length; i++){	
				System.out.println("[" + i + "]" + a[i]);
			}
		}
	}
	
	public static void main (String[] args) { 
		int[] numbers; 					//declaration
		numbers = new int[10]; 			//initialisation
		if(numbers != null){
			printArray(numbers);
			} else{
				System.out.println("nothing inside of numbers array");
				}
	}
}

