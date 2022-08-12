package project8;

public class BoxTest {

	public static void main(String[] args) {
		
		Box b=new Box(20,30,5);
		Box3d bo=new Box3d(20,30,5);
		b.displayArea();
		b.displayVolume();
		bo.displayArea();
		bo.displayVolume();
	}

}
