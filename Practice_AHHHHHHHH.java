public class Practice_AHHHHHHHH {
	
	public static void main (String[] args){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 3; j++){
				double x = Math.random() * 2;
				int y = (int)(x + 1);
				
				if(y == 1)
				System.out.print("H");	
				else
				System.out.print("T");
			}
			System.out.println("");
		}	
	}
}
