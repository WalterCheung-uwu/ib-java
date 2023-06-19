
public class yipeeeeee {
	
	public static void main (String[] args){
		int YipeeCount = 0;
		int angyCount = 0;
		for(int i = 0; i < 100; i++){
			double x = Math.random() * 6;
			int y = (int)(x + 1);	
			if(y == 6){
			System.out.print("yippieee" + " | ");
			YipeeCount = YipeeCount + 1;
			}
			else{
			System.out.print(">:(" + " | ");
			angyCount = angyCount + 1;
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("yippieees: " + YipeeCount);
		System.out.println(">:(s: " + angyCount);
	}
}

