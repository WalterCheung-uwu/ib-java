
public class ArraysTest {
	
	final static int MAXSIZE = 10;
    static int population = 0;
	
	public static void printWholeArray (String[] arrays){
		for(int i = 0; i < arrays.length; i++){
			if(i > 0){
				System.out.print(" ");
				}
				System.out.print(i + ":" + arrays[i]);
			}
		}
		
	public static int printArray (String[] arrays){
		int population = 0;
		for(int i = 0; i < arrays.length; i++){
			if(arrays[i] != null){
				population++;
				}
			}
			return population;
		}
		
	public static boolean isFull(String[] arrays){
		boolean full = true;
		for(int i = 0; i < arrays.length; i++){
			if(arrays[i] == null){
				full = false;
				}
			}
		return full;
		}

    public static boolean isEmpty(String[] arrays){
		boolean empty = true;
		for(int i = 0; i < arrays.length; i++){
			if(arrays[i] != null){
				empty = false;
				}
			}
        return empty;
    }
    
    public static void add (String[] arrays){
		int pop = printArray(arrays);
		
		for(int i = 0; i < arrays.length; i++){
		if(pop < arrays.length){
			pop++;
			arrays[pop - 1] = "Apple";
			}
		}
	}
	
	 public static int search(String[] a, String data){
		String serchedValue = a[3];
		int pos = 0;
		int currentSize = a.length;
		
		while(pos < a.length){
			if(a[pos] == serchedValue){
				a[pos] = a[currentSize - 1];
				currentSize--;
			}
			else{
				pos++;
			}
			for(int i = 0; i < currentSize; i++){
			System.out.print(a[i] + " | ");
		}
		}
		return -1;
    }
		
	public static void swap(String[] a, int index1, int index2){
		
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
		String[] fruits = new String[10];
		printWholeArray(fruits);
		System.out.println("");
		System.out.println("");
		
		System.out.println("length: " + fruits.length);
		int pop = printArray(fruits);
		System.out.println("Population: " + pop);
		System.out.println("Array Is Empty: " + isEmpty(fruits));
		System.out.println("Array Is Full: " + isFull(fruits));
		add(fruits);
		swapArray(fruits);
	}
}

