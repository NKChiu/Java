package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Homework04_00385 {

	public static void main(String[] args) {

System.out.println("**************************** 1 *************************************");
///////////////////1.print all elements of the array and /////////////////////////////
		
		int sum=0;
		int a[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		System.out.print("Array numbers are : ");
		for(int i =0; i<a.length; i++) {
			 System.out.print(a[i]+"   ");
			 sum += a[i];
		}
		System.out.println();
		System.out.print("The average of those numbers in array : "+ (sum=sum/10) );
		System.out.println();
		System.out.print("Those numbers are larger than average : ");
		for(int j = 0; j<a.length; j++) {
			if(a[j] > sum) {
				System.out.print(a[j]+"  ");
			}
		}
		System.out.println(sum);

System.out.println("*************************** 2 **************************************");
////////////////////2 print bellow String in contrary way///////////////////////////////
		
		String s = "Hello World";
		char a1[] = new char[s.length()];
		
		for(int i=0; i< s.length(); i++) {
		 a1[i] = s.charAt(i);
			}
				
		for(int j=a1.length-1; j>=0; j--) {
			System.out.print(a1[j]);
		}System.out.println();

System.out.println("*************************** 3 **************************************");
////////////////////3 calculate how many "a" "e" "i" "o" "u" in below String
////{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		
		
		String s1 = "mercury"+"venus"+"earth"+"mars"+"jupiter"+"saturn"+"uranus"+"neptune";
		int count=0;

		for(int i =0; i<s1.length(); i++) {
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
			count++;
			}
		}
		
		System.out.println(count);

		
System.out.println("******************************* 4 **********************************");
////////////////////4
	
		int a2[][] = {{25,32,8,19,27},
				     {2500,800,500,1000,1200}};
	   int count1= 0;
	   
	   System.out.println("Key in a number: ");
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	  	   
	   System.out.print("Those person can borrow money : ");
		   for(int j=0; j<a2[1].length; j++) {
				if(a2[1][j]>=num) {
				   System.out.print(a2[0][j]+ "   ");
				   count1++;
			   }
		   }
		   System.out.println();
		   System.out.println("There are " + count1 + " of person");
	
		   
System.out.println("******************************* 5 **********************************");
////////////////////5 key in a year month day and calcuclate how many days
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Key in year month day");
		int y = sc1.nextInt();
		int m = sc1.nextInt();
		int d = sc1.nextInt();
		int count2 = 0;
		
		int a3[][] = {{1,2,3,4,5,6,7,8,9,10,11,12},
				      {0,31,59,90,89,151,181,212,243,273,304,334,365}}; 

		if(m>0 && m<=12 && d>0 && d<=31 ) {
		if(m == 1)
			count2 = a3[1][0]+d;
		
		else
			count2 = a3[1][m-1]+d;
		   
		
		if( y%400==0 || ( y%4==0 && y%100!=0 ) )
			count2++;
		}
		
		else
			System.out.println("Error");
		
		System.out.println(count2+"  days");

		
System.out.println("******************************* 6  **********************************");
//////////////////6
		
		int count3=8;
		int a4[][] = {
				 {10,35,40,100,90,85,75,70},
				 {37,75,77,89,64,75,70,95},
				 {100,70,79,90,75,70,79,90},
				 {77,95,70,89,60,75,85,89},
				 {98,70,89,90,75,90,89,90},
				 {90,80,100,75,50,20,99,75}};
		
		int b[][] = new int [6][8];  //set a empty array
		int c[] = new int[8];        //set a empty array
		
		for(int i =0; i<a4.length;i++) {  // put a4 array in b array
		b[i] = Arrays.copyOf(a4[i],8);
		}
   
		for(int i =0; i<=5; i++) {  //sort numbers of a4 array from small to large
		Arrays.sort(a4[i]);
		}
		
		// ↓↓↓↓↓↓↓Compare a4 array to b array
		
		for(int j=0; j<6; j++) {
		for(int i =0; i<8;i++) {
			
			if(a4[j][count3-1] == b[j][i]) {
				//System.out.println(i+1);
				c[i] = c[i]+1;
				}
			}
		}
		
		for(int j=1; j<=8; j++) {
			System.out.print("Num."+j+"\t");
			}
		
		System.out.println();
		for(int i=1; i<=8; i++) {
			System.out.print(" "+c[i-1]+"\t");
		}
		
		
		
 }
}
