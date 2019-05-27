package HomeWork.HomeWork07_2_3_00385;

import java.io.*;

/**************************************** 3 **************************************************************/		
public class HomeWork07_2_3_00385 {
	
/********* function s : check Dir. is exitent or not *******/	
	private static void s(Object object) {
		
    File f = new File("src\\HomeWork\\Data");	
		
	if(object == "not existence") {
     System.out.println("Dir."+ object);
     f.mkdir();
     System.out.println("Auto-created the Dir.");
	}else {
		System.out.println(object);
	}
	
	}
	
/***************** Main() *******************************/	
public static void main(String[] args) throws Exception {
		
		File f = new File("src\\HomeWork\\Data");
		
		s(f.exists()? "Dir.is existent" : "not existence");

/**************************** Cat data ******************************/		
		Cat cat = new Cat("Meow");

		File f1 = new File("src\\HomeWork\\Data\\catdata");
		
		FileOutputStream fioc = new FileOutputStream(f1);
		ObjectOutputStream oboc = new ObjectOutputStream(fioc);
		
		oboc.writeObject(cat);
		
		oboc.close();
		fioc.close();
		
		FileInputStream firc = new FileInputStream(f1);
		ObjectInputStream obic = new ObjectInputStream(firc);
	
		try {
		((Cat)obic.readObject()).speak();
		
		}catch(EOFException e) {
			System.out.println("done");
		}
		
		obic.close();
		firc.close();
		
/**************************** Dog data ******************************/
		
		Dog dog = new Dog("Bark");

		File f2 = new File("src\\HomeWork\\Data\\dogdata");
		
		FileOutputStream fiod = new FileOutputStream(f2);
		ObjectOutputStream obod = new ObjectOutputStream(fiod);
		
		obod.writeObject(dog);
		
		obod.close();
		fiod.close();
		
		FileInputStream fird = new FileInputStream(f2);
		ObjectInputStream obid = new ObjectInputStream(fird);
	
		try {
		((Dog)obid.readObject()).speak();
		
		}catch(EOFException e) {
			System.out.println("done");
		}
		
		obid.close();
		fird.close();
		

	}

}



