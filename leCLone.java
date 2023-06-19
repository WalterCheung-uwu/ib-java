
public class leCLone {
	
	public static void printArray (String[] arrays) {
		for(int i = 0; i < arrays.length; i++){
			if(i > 0){
				System.out.print(", ");
				}
				System.out.print(arrays[i]);
			}
		}
	
	public static void cloneArray (String[] arrays) {
		String[] newArray = arrays.length(arrays.length, arrays.length);
		for(int i = 0; i < arrays.length; i++){
			if(i > 0){
				System.out.print(", ");
				}
				System.out.print(arrays[i]);
			}
		}
	
	public static void main (String[] args) {
		String fruity[] = {"Apple", "Banana", "Orange", "Pear", "Lime"};
		printArray(fruity);
		System.out.println("");
		cloneArray(fruity);
	}
}

