package xxx;

public class Homework02_00385 {

	public static void main(String[] args){
	
System.out.println("==================== 1 =====================");
System.out.println("★★★★★計算 1~100 偶數和(2+4+6+8..+1000)★★★★★★");
	int sum=0;
	for(int n=1; n<=1000; n++){
		if(n%2 == 0) {
			sum = sum+n;
		}
	}
	System.out.println(sum);
	
System.out.println("==================== 2 =====================");
System.out.println("★★★★★計算 1~10 乘積 (1*2*3..*10)(使用for loop)★★★★★★");	
	int sum1=1;
	for(int n=1; n<=10; n++) {
		sum1*=n;
	}
		System.out.println(sum1);
		
		
System.out.println("==================== 3 =====================");
System.out.println("★★★★★計算 1~10 乘積 (1*2*3..*10)(使用 while loop)★★★★★★");
	
	int sum2=1, n=1;
	while(n<=10) {
		sum2*=n;
		n++;
	}
	System.out.println(sum2);
	
System.out.println("==================== 4 =====================");
System.out.println("★★★★★請輸出 1 4 9 16 25 36 49 64 81 100★★★★★★");
	int sum3=0;
	for(int i=1; i<20; i++) {
		if(i%2 == 1) {
			sum3 = sum3+i;
			System.out.print(sum3+" ");
		}
	}
	System.out.println();
System.out.println("==================== 5 =====================");
System.out.println("★★★★★輸出1~49，但尾數及十位數為4的數字不輸出 ，總共有幾個★★★★★★");
	int count=0;
	for(int i=1; i<=49; i++) {
		
		if(i%10 == 4 || i/10%10==4) {
			
			continue;
		}
		count++;
		System.out.print(i+" ");
		
	}System.out.println();
	System.out.println(count);
	
	System.out.println();
System.out.println("==================== 6 =====================");
System.out.println("★★★★★請輸出★★★★★★★★★★");
System.out.println("★★★★★12345678910★★★★★★");
System.out.println("★★★★★123456789★★★★★★");
System.out.println("★★★★★12345678★★★★★★");
System.out.println("★★★★★ .......★★★★★★");
System.out.println("★★★★★......★★★★★★");
System.out.println("★★★★★1★★★★★★");
System.out.println();
for(int a=10; a>0; a--) {
for(int i=1; i<=a; i++) {
	System.out.print(i+" ");
}
System.out.println();
}

System.out.println("==================== 7 =====================");
System.out.println("★★★★★請輸出★★★★");
System.out.println("★★★★★A★★★★★★");
System.out.println("★★★★★BB★★★★★★");
System.out.println("★★★★★CCC★★★★★");
System.out.println("★★★★★DDDD★★★★");
System.out.println("★★★★★EEEEE★★★★");
System.out.println("★★★★★FFFFFF★★★");

int b=65;
for(int i=1; i<=6;i++) {
	
	for(int a=0; a<i; a++) {
		
		System.out.print((char)b);
		
	}
	b++;
	System.out.println();
}


	}
	
}
