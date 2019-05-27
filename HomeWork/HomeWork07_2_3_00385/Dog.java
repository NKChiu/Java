package HomeWork.HomeWork07_2_3_00385;

import java.io.*;

public class Dog implements Serializable{

	private static final long serialVersionUID = 2L;
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking!");
	}
}
