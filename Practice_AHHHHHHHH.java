
public class Practice_AHHHHHHHH {
	
	public static void main (String[] args){
		int array[] = {6, 5, 4, 3, 2, 1};
		for(int i = 0; i < array.length; i++){
			if(i > 0){
				System.out.print(", ");
				}
			System.out.print(array[i]);	
		}
		System.out.println("");
		System.out.println("");
		
			int temp = array[0];
			array[0] = array[5];
			array[5] = temp;
			
			for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", ");	
		}
	}
}
