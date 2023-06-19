
public class Chapter10 {
	
	public static void main (String[] args) {
		System.out.println("Pr 10.1");
		System.out.println("");
		
		String s = IBIO.inputString("Input a word: ");
		char[] x = s.toCharArray();
		
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i]);
		}
			System.out.println("");
			
		for(int j = x.length - 1; j >= 0; j--){
			System.out.print(x[j]);
		}
			System.out.println("");
		
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i]);
		}
		
		for(int j = x.length - 2; j >= 0; j--){
			System.out.print(x[j]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Pr 10.2");
		System.out.println("");
		
		
        String binaryNumber = IBIO.inputString("Input Binary Number: ");
       
        // Check if the input contains only 0's and 1's
        if (!binaryNumber.matches("[01]+")) {
            System.out.println("Error: Invalid input. Please enter a binary number consisting of only 0's and 1's.");
            System.exit(1);
        }

        int decimalNumber = 0;
        int power = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '1') {
                decimalNumber += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimalNumber + ".");
    }
}


