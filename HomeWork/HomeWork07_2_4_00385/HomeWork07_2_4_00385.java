package HomeWork.HomeWork07_2_4_00385;

import java.io.*;

public class HomeWork07_2_4_00385 {
	
// check Dir.Data	
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
	
public static void main(String[] args) throws Exception {
	//check Dir. Data	
		File f = new File("src\\HomeWork\\Data");	
		s(f.exists()? "Dir.is existent" : "not existence");
		
		
		Animal1 a[] = new Animal1[2];
		a[0] = new Cat1("Meow1");
		a[1] =	new Dog1("Bark1");
		
		
		File fa = new File("src\\HomeWork\\Data\\animaldata");
		FileOutputStream foa = new FileOutputStream(fa);
		ObjectOutputStream oboa = new ObjectOutputStream (foa);
		
		
		for (int i = 0; i < a.length; i++)
			oboa.writeObject(a[i]);   //Serializable
		
		foa.close();
		oboa.close();
		
		
		FileInputStream fia = new FileInputStream(fa);
		ObjectInputStream obia = new ObjectInputStream(fia);
	
		try {
			while(true) {
				((Animal1)obia.readObject()).speak(); //opposite Serializable
			     }
			}catch(EOFException e) {
				System.out.println("data read done");
			}
		
		obia.close();
		fia.close();
			

	}

}
