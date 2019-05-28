package idv.david.additional.sort;

import java.util.*;

/***************** set a compare() by self ***************/
class MyComparator implements Comparator<String>{
public int compare(String s1, String s2) {
	 return s1.compareTo(s2)*-1;
	}
}


public class TestPriorityQueue2 {
	public static void main(String[] args) {
		
/******************  anonymous method *********************************/		
//		Comparator<String> c = new Comparator<String>() {
//			public int compare(String a, String b) {
//				return a.compareTo(b) * -1;
//			}
//		};
/**********************************************************************/
		
		MyComparator c = new MyComparator();
		
		PriorityQueue<String> pq = new PriorityQueue<String>(3, c);
							// 3 is meaning set a initial capacity, c mean call the class Comparator
		pq.offer("c");
		pq.offer("a");
		pq.offer("b");
		String s;
		while ((s = pq.poll()) != null) {
			System.out.print(s + ", ");
		}
		
		System.out.println(pq);
	}
}
