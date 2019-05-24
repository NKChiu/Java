package xxx;

public class Factor1 {

	public static void main(String[] args) {
	
	/*	
	int a = 120;
	int i; //因數
	int count = 0 ; //計數

		for(i=2; i<=a; i++) {
			
	
			while(a/i != 0 && a%i==0) {
				count++;
				a/=i;
			//continue back1;	
			//	if(a == i) {break;}
			}
			if(count==1) {
				if(a==1) {
					System.out.println(i);
				}
				else {
				System.out.print(i+"*");
				}
			}
			if(count > 1) {
				if(a==1) {
					System.out.println(i);
				}
				else {
				System.out.print(i+"^"+count+"*");
				}
			}
			
			count = 0;

		}
*/
		int num=100, k=2, count=0;
		System.out.printf("Input: %d %n", num );
		
		if(num == 1 ) {
			System.out.println("No");
		}
		
		else {

			for(k=2; k<num;k++) {
				
			if( num % k ==0) {
				while(num % k ==0) {
					
					if (num == k) {
						break;
					   }
					
					System.out.printf("%d*",k);
					num = num / k;
					count++;
					}

				}			
		
		   }
			System.out.println(num);
		}
		
		
	}
}
