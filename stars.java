
public class stars {
	
	public static void main (String[] args){
			int num = IBIO.inputInt("enter number of lines: "); 
			String aa = stars(num);
			
			for(int i = 0; i < num; i++){
				System.out.println(stars(i + 1));
		}
			for(int i = num; i > 1; i--){
				System.out.println(stars(i - 1));
		}
	}
	
	static String stars(int n){
			String xx = "";
			for(int i = 0; i < n; i++)
				xx = xx + "*";
			return xx;
	}
}

