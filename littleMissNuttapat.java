
public class littleMissNuttapat {
	
	public static void main (String[] args) {
		int[] num = new int[100];
		
		for(int i = 0; i < num.length; i++){
			double x = Math.random() * 6;
			num[i] = (int)(x + 1);	
		}
		for(int i = 0; i < num.length; i++){
			if(num[i] == 1)
			System.out.print("1");
		}
		System.out.println("");
		
		for(int i = 0; i < num.length; i++){
			if(num[i] == 2)
			System.out.print("2");
		}
		System.out.println("");
		
		for(int i = 0; i < num.length; i++){
			if(num[i] == 3)
			System.out.print("3");
		}
		System.out.println("");
		
		for(int i = 0; i < num.length; i++){
			if(num[i] == 4)
			System.out.print("4");
		}
		System.out.println("");
		
		for(int i = 0; i < num.length; i++){
			if(num[i] == 5)
			System.out.print("5");
		}
		System.out.println("");
		
		for(int i = 0; i < num.length; i++){
			if(num[i] == 6)
			System.out.print("6");
		}
		System.out.println("");
	}
}

