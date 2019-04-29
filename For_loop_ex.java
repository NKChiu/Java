package xxx;

public class For_loop_ex {
	public static void main(String[] args) {

	for(int k=5; k>=1; k--) {
		
		int sum=0;
		
		for(int j=k; j>=1; j--) {
		  							
			System.out.print(j);
			
			if((j-1) > 0) {
				System.out.print("+");
				}
			
			sum = sum + j;
		     
			}
		System.out.print("="+sum);
		System.out.println();
			}
	}
}