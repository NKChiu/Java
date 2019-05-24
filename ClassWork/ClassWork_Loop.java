package xxx;

public class ClassWork_Loop {

	public static void main(String[] args) {
		
System.out.println("======================= 課堂練習1===================");
	System.out.println("★★★★Print four times of numbers from 0 to 100★★★★");
		
	for(int n = 0; n<=100; n++)
	{
		if(n%4 == 0) {
			System.out.print(n+" ");
		}
	}
System.out.println();
System.out.println("======================= 課堂練習2===================");
System.out.println("★★★★★print 9x9 table use for & while loop★★★★★★");

	
		int j=0;
		for(int i =1; i<9; i++) {
			while(j<9) {
				j++;
				System.out.print(i+"*"+j +"=" +i*j+"\t");
				//System.out.println();
			}System.out.println();
			j=0;
		}
		
System.out.println("======================= 課堂練習3===================");
System.out.println("★★★★★print 9x9 table use for & do while loop★★★★★★");				
		int j1=0;
		for(int i1=1; i1<9;i1++) {
			
			do {
				j1++;
				System.out.print(i1+"*"+j1 +"=" +i1*j1+"\t");
				}while(j1<9);
			System.out.println();
			j1=0;
			
			}
		
System.out.println("======================= 課堂練習4===================");
System.out.println("★★★★★print 9x9 table use while & do while loop★★★★★★");	
	
		int i2=0, j2=0;
		
		while(i2<9) {
			i2++;
		
		do {
			j2++;
			System.out.print(i2+"*"+j2 +"=" +i2*j2+"\t");
		
		}while(j2<9);
			j2=0;
			System.out.println();
	}
		
		
		
		
	}	
}
