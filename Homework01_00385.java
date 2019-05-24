package xxx;

public class HomeWork01_00385 {
	public static void main(String[] args) {
 System.out.println("============= 1 ===============");
 System.out.println("Q: Please  calculate 12+6 and 12*6:");
	
 	System.out.printf("  A:12+6 = %d , 12*6 =%d %n%n", 12+6, 12*6);
	
	
System.out.println("============= 2 ===============");
System.out.println("Q: Please convert 200 eggs to dozen and left ");

	System.out.printf("  A:200 eggs are : %d dozen and %d eggs%n%n", 200/12, 200%12);

	
System.out.println("============= 3 ===============");	
System.out.println("Q: Please convert 256559 seconds to days, hours, mins, secods");
	
	int s = 256559;
	System.out.printf("  A:%d days, %d hrs, %d mins, %d seconds%n%n", s/86400, (s%86400)/3600, (s%86400%3600)/60, s%86400%3600%60);

	
	
System.out.println("============= 4 ===============");
System.out.println("Q: Please calculate Circular Area and Circumference (π=3.1415),(r=5)");
  double pi = 3.1415;
  int r = 5;
  System.out.printf("  A: Circular Area = %.2f%n     Circumference = %.2f%n%n",r*r*pi, r*2*pi );

System.out.println("============= 5 ===============");
System.out.println("Q: Putting aside 1_500_000 in bank, Interest rate 2%. \n"
		+ "How much money after 10 years? (PS: Compound Interest)");
	
	int p = 1_500_000;												// p = principal
	double rate = 0.02;												// r = interest rate
	
	System.out.printf("  A:Money = %.2f %n%n ", (p * (Math.pow(1+rate,10))));

System.out.println("============= 6 ===============");
System.out.println("Q: Writing code 5+5, 5+'5', 5+\"5\",\n"
		+"use System.out.println() and describe why ");

	System.out.println("5+5 = " + (5+5) + "  :兩個int相加為10");				  
	System.out.println("5+'5'= " + (5+'5') + " :char 的 '5' 轉為 Unicode 的 53，再加上5就為 58");     
	System.out.println("5+\"5\"= "+ (5+"5") + " :int 的 5 跟 String 的 5 保持不變 ，就為 55");				 


	}
}
