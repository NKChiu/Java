package xxx;

public class ClassWork_Array1 {

	public static void main(String[] args) {
		/////Create re Object
		ClassWork_Array1 ra = new ClassWork_Array1();
		////Create x,y,z array
		int[][] x = ra.getRandomArray();  // use getRabdomArray method create x array
		int[][] y = ra.getRandomArray();  // use getRabdomArray method create y array
		int[][] z = new int[3][3];		  // create z array
		
		// Use double for loop assign each x + y element to z array
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		// Use printArray method to print x,y,z array
		System.out.println("x array are:");
		ra.printArray(x);
		System.out.println("y array are:");
		ra.printArray(y);
		System.out.println("z array are:");
		ra.printArray(z);
		
	}
	
	public int[][] getRandomArray() {
		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				int r = (int)(Math.random() * 31);   // assign each number from Math.random() to local variable r
				data[i][j] = r;	 // assign r to data[][];
			}
		}
		return data;
	}
	
	public void printArray(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=============================");
	
	}

}
