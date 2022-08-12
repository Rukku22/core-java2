package project8;

class Box3d extends Box{
	
	Box3d (int length,int breadth,int height){
		super(length,breadth,height);	
		
		
	}
	void displayArea() {
		System.out.println("area of rectangle="+length*breadth);
	}
	void displayVolume() {
		System.out.println("volume of rectangle= "+length*breadth*height);
		
	}
public static void main(String args[])
{
	
}
}
