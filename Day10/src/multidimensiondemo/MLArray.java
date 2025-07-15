package multidimensiondemo;

class MLArray { // removed public
	static void printArray(int c[][]) {
		System.out.println("Array of elements are as follows");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}

 class MLArry {
	// this should match file name: MLArry.java
	
	

	public static void main(String[] args) {
		int c[][] = { {12, 34}, {10, 20}, {1, 2}, {78, 87} };
		
		System.out.println("No. of rows in C array: " + c.length);
		MLArray.printArray(c);
	}
}
