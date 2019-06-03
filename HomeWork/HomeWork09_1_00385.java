package HomeWork;

class CountRunnable implements Runnable{

	 int count = 1;
	String name;
	Thread th;
	
	public CountRunnable() {
		// Empty Constructor
	}
	
	CountRunnable(String threadname){
		name = threadname;
		th = new Thread(this, name);
		th.start();
	}
	
	
	@Override
	public void run() {
		while(count <= 10 ) {
			
			System.out.println(th.getName()+"吃了 : "+count+"碗飯");
			count++;
			
			try {
				//Thread.sleep(500);
				Thread.sleep((int)(Math.random()*3000+500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}

public class HomeWork09_1_00385 {

	public static void main(String[] args) {


		 
	System.out.println("Start");	
		CountRunnable a = new CountRunnable("饅頭人");			
		CountRunnable b = new CountRunnable("詹姆士");
		
		
	}
}
