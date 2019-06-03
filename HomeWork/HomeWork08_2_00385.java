package HomeWork;


import java.util.*;

class Train implements Comparable<Train>{
	
	private int number;  	//班次
	private String type; 	//車種
	private String start;	//出發地
	private String dest;	//目的地
	private double price;	//票價
	

	public int getnumber() {
		return number;
	}
	public void setnumber(int number) {
		this.number = number;
	}
	
	
	public String  gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	
	public String getstart() {
		return start;
	}
	public void setstart(String start) {
		this.start = start;
	}
	
	public String getdest() {
		return dest;
	}
	public void getdest(String dest) {
		this.dest = dest;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	
/************* Override hashCode for HashSet*********************/	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
//		result = prime * result + number;
//		long temp;
//		temp = Double.doubleToLongBits(price);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + ((start == null) ? 0 : start.hashCode());
//		result = prime * result + ((type == null) ? 0 : type.hashCode());
//		return result;
//	}
	
/************* Override equals for HashSet *********************/	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Train other = (Train) obj;
//		if (dest == null) {
//			if (other.dest != null)
//				return false;
//		} else if (!dest.equals(other.dest))
//			return false;
//		if (number != other.number)
//			return false;
//		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
//			return false;
//		if (start == null) {
//			if (other.start != null)
//				return false;
//		} else if (!start.equals(other.start))
//			return false;
//		if (type == null) {
//			if (other.type != null)
//				return false;
//		} else if (!type.equals(other.type))
//			return false;
//		return true;
//	}
	
/************* Override compareTo for ArrayList *********************/		
	@Override
	public int compareTo(Train aTrain) {
		if(this.number > aTrain.number) {
			return 1;
		} else if(this.number == aTrain.number) {
			return 0;
		}else {
			return -1;
		}
			
	}
	
}



public class HomeWork08_2_00385 {

	public static void main(String[] args) {

		Set<Train> list = new HashSet<Train>();
		
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		list.add(t1);
		list.add(t2);
		list.add(t3); 
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
/***************************************************************************************************************************************/
/* Q1: used with HashSet and show no duplicate number. 
 * Attention: need to ENABLE overriding hashCode() and equals()*/	
		
//	/* by Iterator interface interator()*/
//		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {
//			Train str = (Train) it.next();
//			System.out.println(str.getnumber()+","+str.gettype()+","+str.getstart()+","+str.getdest()+","+str.getprice());
//		}
//		
//	/* by for-each()*/
//		
//		for(Train str: list) {
//			System.out.println(str.getnumber()+","+str.gettype()+","+str.getstart()+","+str.getdest()+","+str.getprice());
//		}
/***************************************************************************************************************************************/		
/* Q2: show all no duplicate train in sequence 
 * Attention: need to ENABLE overriding hashCode() and equals()*/
		
//		ArrayList<Train> list1 = new ArrayList<Train> (list);
//		   //↑↑↑ can put those elements of collection of HashSet in ArrayList, then can use "compareTo()"
//		Collections.sort(list1);
//			//↑↑↑ use above sort(), neeed to overriding compareTo() in the Train class
//		for(Train str: list1) {
//			System.out.println(str.getnumber()+","+str.gettype()+","+str.getstart()+","+str.getdest()+","+str.getprice());
//		}
		
/* Q3 : add a Train (116, "自強", "高雄", "台北", 500) then get all train including duplicate train
 * Attention: need to DISABLE overriding hashCode() and equals()*/		
		
		Train t8 = new Train(116, "自強", "高雄", "台北", 500);
		list.add(t8); // add a new train
		
		List<Train> list2 = new ArrayList<Train> (list);
		
		Collections.sort(list2);
		
		for(Train str: list2) {
			System.out.println(str.getnumber()+","+str.gettype()+","+str.getstart()+","+str.getdest()+","+str.getprice());
		}
		
	}

}
