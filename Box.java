package project8;

public class Box {
int length;
int breadth;
int height;
Box(int l,int b,int h){
	this.length=length;
	this.breadth=breadth;
	this.height=height;
	
}
void displayArea() {
	System.out.println("area of rectangle="+length*breadth);
}
void displayVolume() {
	System.out.println("volume of rectangle="+length*breadth*height);
	
}

}