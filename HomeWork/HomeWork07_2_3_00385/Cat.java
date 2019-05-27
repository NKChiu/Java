package HomeWork.HomeWork07_2_3_00385;

import java.io.*;

public class Cat implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
