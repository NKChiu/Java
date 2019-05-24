package xxx;

import java.util.*;   // include library 
import java.util.Scanner;

public class Factor0_1{
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
    LinkedList<Integer> list = new LinkedList<Integer>(); // 建立 list
    
	int m = scanner.nextInt();
	int n = scanner.nextInt();
	int y,z,o;
	
	if (m > n) {
		System.out.printf("Max value m=%d, Min value n=%d%n", m, n);
	}	

	else if (m < n) {
		o = m;
		m = n;
		n = o;
		System.out.printf("Max value m=%d, Min value n=%d%n", m, n);
	}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		for(int a = 2;a <=n; a++){	
		y= m%a; 
		z= n%a ;
		
		if((y|z) == 0) {
			list.add(a);  // 將a 帶入 list		
			}
		}
		System.out.println("Max val: " + Collections.max(list)); // 比對 list 中最大數值
	}
}	

