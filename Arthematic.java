package project8;
interface Test{
	 void square();
		
	}
class Arthematic implements Test {
@Override
public void square() {
	System.out.println("creating interface");

	
}
}

  class ToTestInt {
	public static void main(String args[]) {
		
		 Test t=new  Arthematic();
		  t.square();


	}
  }
   

	



