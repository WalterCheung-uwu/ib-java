
public class lolArrays {
	
	public static void main (String[] args) {
		int num[] = {163, 491, 211, 5, 509, 17, 313, 197, 7, 31, 97};
		
		for(int i = 0; i < num.length; i++){
			System.out.print(num[i] + " | ");
		}
		System.out.println("");
		System.out.println("");
		
		int serchedValue = 211;
		int pos = 0;
		int currentSize = num.length;
		
		while(pos < num.length){
			if(num[pos] == serchedValue){
				num[pos] = num[currentSize - 1];
				currentSize--;
			}
			else{
				pos++;
			}
		}
		for(int i = 0; i < currentSize; i++){
			System.out.print(num[i] + " | ");
		}
	}
}

