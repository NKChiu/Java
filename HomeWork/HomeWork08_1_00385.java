package HomeWork;

import java.math.BigInteger;
import java.util.*;

public class HomeWork08_1_00385 {

	public static void main(String[] args) {

		List list = new ArrayList();
		
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

System.out.println("========================= Q1 ==================================");	
System.out.println("========= for-loop ===============");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+"    ");
		}
		
System.out.println();
System.out.println("========= for-each ===============");
		
		for(Object i : list) {
			System.out.print(i+"    ");
		}
		
System.out.println();
System.out.println("========= Iterator ===============");

		for(Iterator i = list.iterator(); i.hasNext();) {
			System.out.print(i.next()+"    ");
		}
		
System.out.println();		
System.out.println("========================= Q2 ==================================");
System.out.println("= show all elements of collection except not Number_type =");

		Iterator i1 = list.iterator();
		while(i1.hasNext()) {
			Object obj = i1.next();
			if(obj instanceof Number) {
				System.out.println(obj);
			}
		}

	}

}
