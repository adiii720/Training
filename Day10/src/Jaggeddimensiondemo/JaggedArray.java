package Jaggeddimensiondemo;

public class JaggedArray {
	
	static void printArray(int c[][]) {
		System.out.println("Array of elements are as follows");
		for (int i = 0; i < c.length; i++) {  // Fixed loop condition
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}