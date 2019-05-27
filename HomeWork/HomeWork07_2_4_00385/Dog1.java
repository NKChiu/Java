package HomeWork.HomeWork07_2_4_00385;


public class Dog1 extends Animal1{

	
	private String name;
	
	public Dog1(String name) {
		this.name = name;
	
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking!");
	}
}
