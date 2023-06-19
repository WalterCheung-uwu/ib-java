
public class IAMDED {
	
	 public static void main(String[] args)
    {
        String[] arr = new String[MAXSIZE];
        System.out.println("1. printWholeArray + length:\n   Expected output >>> 0:null  1:null  2:null  3:null  4:null  5:null  6:null  7:null  8:null  9:null  [ length: 10 ]");
        System.out.print("   Y O U R  output >>> "); printWholeArray(arr);
        System.out.println("\n2. printArray + population:\n   Expected output >>> [ population: 0 ]");
        System.out.print("   Y O U R  output >>> "); printArray(arr);
        System.out.println("\n3. Testing isFull()  method [false] >>> " + isFull(arr));
        System.out.println("   Testing isEmpty() method [true]  >>> " + isEmpty(arr));
        System.out.println("\n4. Testing the add() method...");
        add(arr, "apple");
        add(arr, "banana");
        add(arr, "cherry");
        add(arr, "dragonfruit");
        add(arr, "elderberry");
        add(arr, "fig");
        add(arr, "gooseberry");
        add(arr, "imbe");
        add(arr, "jujube");
        add(arr, "kiwi");
        System.out.print("   Output should be: Error adding longan >>> ");
        add(arr, "longan");
        System.out.println("   Expected output >>> 0:apple  1:banana  2:cherry  3:dragonfruit  4:elderberry  5:fig  6:gooseberry  7:imbe  8:jujube  9:kiwi  [ population: 10 ]");
        System.out.print("   Y O U R  output >>> ");
        printArray(arr);
        System.out.println("\n5. Test search(arr, \"banana\") method [1]: " + search(arr, "banana"));
        System.out.println("   Test search(arr, \"grape\") method [-1]: " + search(arr, "grape"));
        String[] full = clone(arr);
        System.out.println("\n6. Testing clone method String[] full = clone(arr); [false]: " + arr.equals(full));
        System.out.println("\n7. Testing remove(arr, \"dragonfruit\"); remove(arr, \"gooseberry\"); - output should be as below:");
        remove(arr, "dragonfruit");
        remove(arr, "gooseberry");
        System.out.print("   Testing remove(arr, \"watermelon\") should output error: watermelon not found >>> ");
        remove(arr, "watermelon");  
        System.out.println("8. Testing swap(arr, 0, 5);");
		swap(arr, 0, 5);
        System.out.println("   Testing swap(arr, 3, 10); swap(arr, -3, 1); this should generate two errors >>>");
        System.out.print("   "); swap(arr, 3, 10);
        System.out.print("   "); swap(arr, -3, 1);
        System.out.println("   Expected output >>> 0:fig  1:banana  2:cherry  4:elderberry  5:apple  7:imbe  8:jujube  9:kiwi  [ population: 8 ] (printArray)");
        System.out.print("   Y O U R  output >>> "); printArray(arr);
        System.out.println("\n9. Testing replace(arr, \"apple\", \"papaya\") ");
        replace(arr, "apple", "papaya");
        System.out.println("   Expected output >>> 0:fig  1:banana  2:cherry  3:null  4:elderberry  5:papaya  6:null  7:imbe  8:jujube  9:kiwi  [ length: 10 ] (printWholeArray)");
        System.out.print("   Y O U R  output >>> ");
        printWholeArray(arr);
        System.out.print("   Testing replace(arr, \"watermelon\", \"apple\") should output error: watermelon not found >>> ");
        replace(arr, "watermelon", "apple");
        System.out.println("\n10. Testing insert(arr, \"plum\", 0) ");
        insert(arr, "plum", 0);
        System.out.println("    Expected output >>> 0:plum  1:banana  2:cherry  3:fig  4:elderberry  5:papaya  6:null  7:imbe  8:jujube  9:kiwi  [ length: 10 ] (printWholeArray)");
        System.out.print("    Y O U R  output >>> ");
        printWholeArray(arr);
        System.out.print("    Testing insert(arr, \"mango\", 11) should output an error >>> ");
        insert(arr, "mango", 11);
        

    }
}
