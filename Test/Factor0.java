package xxx;

import java.util.Scanner;

public class Factor0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int y, z, ans=0;
		int o = 0;

		if (m > n) {
			System.out.printf("Max value m=%d, Min value n=%d%n", m, n);
		}

		else if (m < n) {
			o = m;
			m = n;
			n = o;
			System.out.printf("Max value m=%d, Min value n=%d%n", m, n);
		}

		
		for (int a =1; a<=n; a++) {
			y = m%a;
			z = n%a;
			 if(y==0 && z==0) {
				 ans = a;
			 }
		}
		System.out.println(ans);
		
		/*
		while (m % n != 0) {
			o = m % n;
			m = n;
			n = o;

		}
*/


//		
//		 do{ o = m % n; m = n; n = o;
//		  
//		 } while (o == 0);
//		 
//		 
//		 System.out.printf("%d, %d, %d", m, n, o);
		 

	}
}
