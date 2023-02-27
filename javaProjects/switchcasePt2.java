
public class switchcasePt2 {
	
	public static void main (String[] args) {
			int sum = 0;
			for(int x = 1; x <= 1000; x++)
		{
			int y = x % 3;
			System.out.println("x = " + x + " | x % 3 = " + y + " | ");
			}
			switch(y){
			case 0:
				int x = (x * -5);
				break;
			case 1:
				int x = (x * 7);
				break;
			case 2:
				int x = (x * 2);
				break;
			}
	}	
}

