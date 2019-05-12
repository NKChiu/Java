package HomeWork;


abstract class  Pen{
	protected String brand;
	protected double price;
	
	public void Getter() {
		System.out.println(brand);
		System.out.println(price);
	}
	
	public void Setter(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
		public abstract void  write();
		public abstract void getPrice();
}

class Pencil extends Pen{
	@Override
	public void getPrice() {
		this.price = price*0.8;
		System.out.println("鉛筆價格為: "+ price);
	}
	
	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
}

class InkBrush extends Pen{

	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}

	@Override
	public void getPrice() {
		this.price = price*0.9;
		System.out.println("墨水筆價格為: "+price);		
	}
	
}

public class HomeWork05_1_00385 {

	public static void main(String[] args) {

		Pencil p = new Pencil();
		InkBrush i = new InkBrush();
		
		p.Setter("SKB", 20.0);
		i.Setter("Pentel", 100.0);
		
		p.getPrice();
		p.write();
System.out.println("======================================");
		i.getPrice();
		i.write();
		
	}

}
