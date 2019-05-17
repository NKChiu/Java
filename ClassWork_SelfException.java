package ClassWork;



////////CubeException////////////////////////////////////////
class CubeException extends Exception {

	public CubeException() {}

	public CubeException(String msg) {
		super(msg);
		}
}

////////class Cube ////////////////////////////////////////
class Cube {
	private double length;

	public Cube() {}

	public Cube(double length) throws CubeException {  // throws CubeException cannot delete
//***************************************************************/			
//	if(length > 0)								       	//
//		this.length = length;						  	//
//	else												//
//		throw new CubeException("正立方體邊長不得為0或是負數");	//
/*****above statement is repeated below "setLength()"***********/
	
//////so that's can change following statement//
	setLength(length);				  //
/******************************************/		
	}

	public double getLength() {
		return length;
		}

	public void setLength(double length) throws CubeException {
	if (length > 0)
		this.length = length;
	else
		throw new CubeException("The length is smaller than 0");
	}

	public double getVolume() {
		return Math.pow(length, 3);
		}
}

////////Main ////////////////////////////////////////
public class ClassWork_SelfException {
	public static void main(String[] args) {

		try {
			Cube c1 = new Cube(-10);
			System.out.println(c1.getVolume());
		} catch (CubeException e) {
			e.printStackTrace();
		}
	}
}