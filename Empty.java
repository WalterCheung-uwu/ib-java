
public class Empty {
	
	public static boolean Empty (String[] array) {
		boolean empty = true;
		for(int i = 0; i < array.length; i++){
			if(array[i] != null){
				empty = false;
				}
			}
			return empty;
		}
	
	public static void main (String[] args) {
		String names[] = {"urmom"};
		System.out.println(Empty(names));
	}
}

