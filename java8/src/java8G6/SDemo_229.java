package java8G6;

public class SDemo_229 {
	public static void main(String[] args) {
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();
		//Each object has its own copy of an instance variable.
		ob1.x=10;
		ob2.x=20;
		System.out.println(" ob.x and ob2.x " + " are independent.");
		System.out.println();
	}
}
//Use a static variable
class StaticDemo{
	int x;// a normal instance variable
	static int y;// a static variable 
	//Return the sum of the instanse variable x
	// and the static variable y.
	int sum() {
		return x+y;
	}
}
