package HomeWork;

class Account{
	private int account = 0;
     int bearcount = 0;

	synchronized public void deposit(int acc) {
		
		while(account > 2000) {
			System.out.println("\t\t Mom found account > 2000, don't need to deposit");
			
			try {
				wait();
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		account += acc;
		System.out.println("MOM deposit: "+acc+ "; The Account: "+ account);
		
		if(account >= acc) {
			System.out.println("\t\t Account is enough to be withdrawed");
		notifyAll();
		}
	}
	
	synchronized public void withdraw(int acc) {
		

		
		while(account < 1000) {
			System.out.println("\t\t BigBear foun accoutn < 1000, cannot withdraw");
			
			try {
				wait();
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		account -= acc;
		System.out.println("BigBear withdraw: "+acc+ "; The Account: "+account);
		
		if(account < acc) {
			System.out.println("\t\t Account is not enough to be withdrawed");
			notifyAll();
		}
	  }

	
}


class Mom extends Thread{
	Account account;
	
	public Mom(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i=1; i<=10; i++) {
			account.deposit(2000);
		}
	}
	
}

class BigBear extends Thread{
	Account account;
	
	public BigBear(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i =1; i<=10; i++) {
			account.withdraw(1000); // if type 1000 will be deadlock. if change to 2000 can deal
		}
	}
	
}



public class HomeWork09_2_00385 {
	public static void main(String[] args) {

		Account acco = new Account();
		Mom mom = new Mom(acco);
		BigBear bigbear = new BigBear(acco);
	
		bigbear.start();
		mom.start();
	
	}

}
