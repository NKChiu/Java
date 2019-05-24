package xxx;

public class Factor2 {
	public static void main(String[] args) {
		int number = 60;
		int counter = 0;
		System.out.print(number + "=");
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				
				if (number == i) {
					counter++;
					if (counter == 1) {
						System.out.print(i);
					} 
					else {
						System.out.print(i + "^" + counter);
					}
				} 
				
				else {
					number /= i;
					--i;
					counter++;
				}
			} 
			
			
			else {
				if (counter == 0) {

				} 
				else {

					if (counter == 1) {
						System.out.print(i + "*");
					} else {
						System.out.print(i + "^" + counter + "*");
					}

					counter = 0;
				}

			}
		}
		
		
		

	}
}
