package xxx;

public class ClassWork_Array {

	public static void main(String[] args) {
		
		//////// Create x,y,z 3X3 array
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		System.out.println("x array are: ");
		///////////// Use double for loop assign each element to x array
		for(int i=0; i< x.length; i++) {
			for(int j=0; j < x[i].length; j++) {
				x[i][j] = (int)(Math.random()*31);
				System.out.print(x[i][j]+"   ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("y array are: ");
		///////////// Use double for loop assign each element to y array
		for(int i=0; i< y.length; i++) {
			for(int j=0; j < y[i].length; j++) {
				y[i][j] = (int)(Math.random()*31);
				System.out.print(y[i][j]+"   ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("z array are: ");
		///////////// Use double for loop assign each  x + y element to z array
		for(int i=0; i< z.length; i++) {
			for(int j=0; j < z[i].length; j++) {
				z[i][j] = x[i][j]+y[i][j];
				System.out.print(z[i][j]+ "   ");				
			}
			
			System.out.println();
		}

	}

}
