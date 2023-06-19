import java.util.Stack;

public class Q4test
{
    public static int[] clone(int[] a)
    {
		int[] clonedArray = new int[a.length];
		for(int i = 0; i < clonedArray.length; i++){
			clonedArray[i] = a[i];
			}
		
        return clonedArray;
    }

    public static String[] clone(String[] a)
    {
		String[] clonedArray = new String[a.length];
		for(int i = 0; i < clonedArray.length; i++){
			clonedArray[i] = a[i];
			}
        return clonedArray; 
    }

    public static void printArray(String[] array)
    {
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
			}	
    }

    public static void printArray(int[] array)
    {
		for(int i = 0; i < array.length; i++){
			if(i < 0){
				System.out.print(" ");
				}
				System.out.print(array[i] + " ");
			}
    }

    public static void parallelPrint(String[] sa, int[] ia)
    {
		for(int i = 0; i < ia.length; i++){
			System.out.printf("%d %s\n", ia[i], sa[i]);
			}
    }

    // true if arrays may be parallel, false otherwise
    public static boolean areParallel(String[] sa, int[] ia)
    {
        boolean isParallel = false;
        if(sa.length == ia.length){
		isParallel = true;
		}
		return isParallel;	
    }

    public static void search(String[] sa, int[] ia, int goals)
    {
		
    }

    public static void selectionSort(String[] sa)
    {
		for(int i = 0; i < sa.length; i++){
			for(int j = 0; j < sa.length; j++)
				if(sa[i].compareTo(sa[j]) < 0){
					String temp = sa[i];  
					sa[i] = sa[j];  
					sa[j] = temp;
					
					for(String k : sa){
						System.out.print(k + " ");
						}
						System.out.println("");
					}
				}
	}
    public static void bubbleSort(int[] array)
    {
		for(int i = 0; i < array.length - 1; i++){
			for(int j = 0; j < array.length - i - 1; j++ ){
				if(array[j] < array[j + 1]){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					for(int k : array){
						System.out.print(k + " ");
						}
						System.out.println("");
				}
			}
		}
    }

    public static void parallelSelectionSort(String[] sa, int[] ia)
    {
		
    }

    public static void parallelBubbleSort(String[] sa, int[] ia)
    {
		int x = ia.length - 1;
		
		for(int i = ia.length; i > 0; i--){
			for(int j = ia.length; i > 0 + i + 1; i--){
				if(ia[j] < ia[j + 1]){
					int temp = ia[j];
					ia[j] = ia[j + 1];
					ia[j + 1] = temp;
					for(int k : ia){
						System.out.print(k + " ");
						}
						System.out.println("");
					}
				}
			}
    }


    public static void main(String[] args)
    {
        String[] bad = {"Cow", "Chicken", "Johnny", "Diddy", "Dexter"};
        String[] originalPlayers = {"Perpetua", "Maribel", "Homare", "Lotta", "Eugenie", "Vivianne", "Portia",
                "SunWen", "Patrizia", "Marta", "Julie", "Birgit", "Maysah", "Abby", "Christine"};
        int[] originalRecords = {80, 82, 83, 88, 88, 95, 101, 106, 110, 115, 116, 128, 130, 184, 190};
        String[] players1 = clone(originalPlayers); // clone = #1
        int[] records1 = clone(originalRecords);
        String[] players2 = clone(originalPlayers);
        int[] records2 = clone(originalRecords);
        String[] players3 = clone(originalPlayers);
        int[] records3 = clone(originalRecords);

        System.out.println("\nPrint player names array");
        printArray(players1); // 2
        System.out.println("\n\nPrint array of goals");
        printArray(records1); // 3
        System.out.print("\n\nCheck if the arrays are parallel: ");
        if( !areParallel(bad, records1) ) // 4 areParallel
        {
            System.out.println("Error-Arrays are not parallel");
        }
        System.out.println("\nPrint parallel arrays");
        parallelPrint(players1, records1); // 5
        System.out.println("\nPlayers with 120 goals or more by name (linear search)");
        search(players3, records3, 120); // 6
        System.out.println("\nSort players alphabetically with selection sort");
        selectionSort(players1); // 7
        printArray(players1);
        System.out.println("\n\nSort records by most goals using bubble sort");
        bubbleSort(records1); // 8
        printArray(records1);
        System.out.println("\n\nSort parallel arrays by most goals using bubble sort");
        parallelBubbleSort(players2, records2); // 9
        System.out.println("Top scorers");
        parallelPrint(players2, records2);
        System.out.println("\nSort parallel arrays by player names with selection sort");
        parallelSelectionSort(players3, records3); // 10
        System.out.println("Players by name");
        parallelPrint(players3, records3);
        // +: beautify the output
    }
}

