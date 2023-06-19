
public class sortingStrings {
	
	public static void sortStrings (String[] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length; j++)
				if(array[i].compareTo(array[j]) < 0){
					String temp = array[i];  
					array[i] = array[j];  
					array[j] = temp;
					
					for(String k : array){
						System.out.print(k + " ");
						}
						System.out.println("");
					}
				}
			}
	
	public static void main (String[] args){
		String[] array = {"Bee", "EEEEEE", "Denmark", "France", "Apple", "Chibai"};
	
		for(String i : array){
			System.out.print(i + " ");
		}
		System.out.println("");
		
		sortStrings(array);
	}
}


