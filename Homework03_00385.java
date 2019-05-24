package HomeWork;

import java.util.Scanner;

public class Homework03_00385 {

	public static void main(String[] args) {

		////////////////////////1.triangle
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please key in three side length of triangle:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a+b>c && a+c>b && b+c>a && a*b*c!=0) {
			System.out.println("Triangle");
			
			// a=b b=c c=a
			if(a == b || a == c || b==c ) {
				if(a == b && a == c) {
					System.out.println("正三角形");
				 }
				else 
				   System.out.println("等邀角形");
				}
			
			else if((a*a == b*b + c*c) || (c*c == a*a + b*b) || (b*b == a*a + c*c))
					System.out.println("直角三角形");
			else	
				System.out.println("其他三角形");
			
			}
		
		else 
			System.out.println("不是三角形");
		
System.out.println("*********************************************************************");
////////////////////// 2.guess number

	Scanner sc1 = new Scanner(System.in);
	
	System.out.print("Key in a number: ");
	
	int num = (int)(Math.random()*11);
	int num1;
	
	
	while(true) {
		num1 = sc1.nextInt();
		if(num1 == num) {
			System.out.println("Got it");
			break;
		}
		else if(num1 > num) {
			System.out.println("error");
			System.out.println("larger than answer");
		}
		else if(num1 < num) {
			System.out.println("error");
			System.out.println("smaller than answer");
		}
			
	}
	
System.out.println("*********************************************************************");
///////////////////////// 3.select numbers from 1 to 49 except those unlike numbers 
	Scanner sc2 = new Scanner(System.in);
	
	System.out.print("key in the unlike number: ");
	int num2 = sc2.nextInt();
	int count=0;
	
	for(int i=1; i<=49; i++) {
		
		if(i%10 == num2 || i/10%10==num2) {
			
			continue;
		}
		
		count++;
		System.out.print(i+"\t");
		if(count % 6 ==0) {
			System.out.println();
		}
	}
	System.out.println();
	System.out.println("There ara  " + count + " rest");

		
		
System.out.println("*********************************************************************");
///////////////////////3.1 select numbers from 1 to 49 except those unlike numbers and print randomly 6 numbers	

Scanner sc3 = new Scanner(System.in);

System.out.println("key in a unlike number:");

int num3 = sc3.nextInt();
int a0[] = new int[49];
int a1[] = new int[6];
int count1 = 0;

for (int i=0 ; i<a0.length; i++) { //put in 1-49 numbers in array
	a0[i] = i+1;
	//System.out.print(a0[i] +" ");
}



System.out.print("Randomly six numbers are : ");

for(count1=0; count1<6; count1++ ) {
	int s = (int)(Math.random()*a0.length); 
	

	if(a0[s]%10 == num3 || a0[s]/10%10 == num3) {  // Excluding unlike numbers
		count1--;
		continue;
	}
	
	//↓↓↓↓↓  Excluding those have picked up numbers
	if(a1[0] == a0[s] || a1[1] == a0[s] || a1[2] == a0[s] || a1[3] == a0[s] || a1[4] == a0[s] || a1[5] == a0[s]) { 
	count1--;
	continue;
     }
				
	a1[count1] = a0[s];  // TO put in those are picked six numbers in sequence 
	
	System.out.print(a1[count1]+"\t");
	
   }		
/////////////////////////////////////////// END///////////////////////////////////////////////////////

	}

}
