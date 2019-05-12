package HomeWork;

import java.util.Scanner;

///////////////////  CLASS AREA //////////////////////////////////////////

////////////////////////////  1 //////////////////////////////////////////
class  starSquare{ // square class for 1st 
	public starSquare(int width, int height) { //show square constructor
		
		System.out.println("The square area is");
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

//////////////////////////// 2 //////////////////////////////////////////
class radnAvg{	// show 10 random numbers and calculate its average for 2nd
	public int num[] = new int[10];
	double sum = 0;
	public void getRand() {
		for(int i = 0; i<10; i++) {
			num[i] =  ((int)(Math.random()*100)); //pick up 10 random num. assigning to array num[]
				System.out.print(num[i]+"  ");  // show 10 numbers in sequence.		
				sum += (num[i] / 10.0); //calculate average of 10 numbers
		}
		System.out.println();
	}
}

//////////////////////////// 3 //////////////////////////////////////////
class MaxEle{  // Finding the max numbers in two-dimensional array using overloading for 3rd
	public int compare = 0;
	public double compare1 = 0.0;
	
	public double maxElement(int x[][]) {
		 for(int i=0; i<2; i++) {
			   for(int j=0; j<3; j++) {
				   if(x[i][j] > compare) {
					   compare = x[i][j];
				   }
			   }
		   }
		return compare;		
	}
	
	public double maxElement(double x[][]) {
		 for(int i=0; i<2; i++) {
			   for(int j=0; j<3; j++) {
				   if(x[i][j] > compare1) {
					 compare1 = x[i][j];
				   }
			   }
		   }
		return compare1;
	}
}

//////////////////////////// 4 //////////////////////////////////////////
class MyRectangle{  //use overloading constructor to calculate rectangle area for 4th
	double width, depth;
	
	void setWidth(double width) {
		this.width = width;
	}
	void setDepth(double depth) {
		this.depth = depth;
	}
	double getArea(){
		return width*depth;}
	
	public MyRectangle() {};  // constructor 1
	
	public MyRectangle(double width, double depth) { //constructor2 use overloading
		this.width = width;
		this.depth = depth;
		this.getArea();
	}
}


//////////////////////////// 5 //////////////////////////////////////////
class AutoCode{  // for 5th 
	int n=0;
	
	void genAuthCode() {

for(int count=0; count<=8; count++) {
	int index = (int)((Math.random()*3));
	switch (index) {
	case 0: n =((int)(Math.random()*(57-48+1))+48);  //  decimal 48-57 = char 0-9 
	        break;
	case 1: n =(int)(Math.random()*(90-65+1))+65;    //  decimal 65-90 = char A-Z 
			break;
	case 2: n = (int)(Math.random()*(122-97+1))+97;  //  decimal 97-122 = char a-z 
			break;
	  }
	   System.out.print((char)n);
     }
  }
}

//////////////////////////// MAIN AREA //////////////////////////////////////////
public class HomeWork05_00385 {

	public static void main(String[] args) {
		
		
System.out.println("====================== 1 ==========================");

		Scanner sc = new Scanner(System.in);
		System.out.print("Key in a width of square: ");
		int width = sc.nextInt();
		System.out.print("Key in a height of square: ");
		int height = sc.nextInt();
		
		starSquare startSquare = new starSquare(width, height); //create a constructor and show square
	
		
System.out.println("====================== 2 ==========================");
radnAvg avg = new radnAvg();

System.out.println("10 numbers are: ");
avg.getRand();
System.out.println("The average of 10 numbers is: "+avg.sum);


System.out.println("====================== 3 ==========================");
int[][] intArray = {{1,6,3},
					{9,5,2}};
double[][] doubleArray = {{1.2,3.5,2.2},
						  {7.4,2.1,8.2}};

   MaxEle x = new MaxEle();

  System.out.println((int)x.maxElement(intArray));
  System.out.println(x.maxElement(doubleArray));
 
		
		
System.out.println("====================== 4 ==========================");

MyRectangle rectangle = new MyRectangle();
rectangle.setWidth(10);
rectangle.setDepth(20);
System.out.println(rectangle.getArea());

System.out.println(new MyRectangle(10,20).getArea());

		
System.out.println("====================== 5 ==========================");

System.out.println("The 8 randomly nubers are: ");
new AutoCode().genAuthCode();

	}

}
