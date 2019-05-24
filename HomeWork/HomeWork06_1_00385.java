/**************************************************************
  請設計兩個類別CalException.java與CalTest.java，在CalTest.java裡有個自
訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。使用者
可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
1. x與y同時為0， (產生CalException的例外物件)
2. y為負值，而導致x的y次方結果不為整數
3. x與y皆正確情況下，會顯示運算後結果
**************************************************************/
package HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

class CalException extends Exception{
	
	public CalException() {}
		
	public CalException(String mes) {
		super(mes);
	}
	
}

 class Cal{
	int x, y;
	public Cal() {}
	
	public Cal(int x, int y) throws CalException{
		this.x =x;
		this.y=y;
	}


	public int calPow(int x, int y) throws CalException{
		int r;
		
		if(y<0) {
			throw new CalException("次方為負值");
		}
		if(y==0 && x==0) {
			throw new CalException("0的0次方沒有意義");
		}
		else {	
			 r = (int)(Math.pow(x, y));   //execute pow method
		}
		return r;
	}
}


public class HomeWork06_1_00385 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x,y;
		int result = 0;
		
 do {
	
		try {
			 System.out.println("請輸入X的值: ");
			x = sc.nextInt();
			 System.out.println("請輸入y的值: ");
		    y = sc.nextInt();
			Cal r = new Cal(x,y);     // create r Obj.
			result = r.calPow(x, y);  // use calPow() calculate Power and assign to Var. result
			System.out.println(x + " 的 "+ y + " 次方 = "+result);
		}catch(CalException e) {
			System.out.println(e.getMessage());
			result = -1;               // get CalException, set result -1  to let that code are trapped in do-while loop 
		}catch (InputMismatchException e1) {
			System.out.println("輸入格式錯誤");
			sc.next();          //if input type is wrong, finds and returns the next complete token from this scanner
			result = -1;			// get InputMismatchException, set result -1  to let that code are trapped in do-while loop 
		}
	
	}while(result < 0);


	}

}
