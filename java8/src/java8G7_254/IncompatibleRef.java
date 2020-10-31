package java8G7_254;

class X{
	int a;
	
	X(int i){
		a = i;
	}
}
	 class Y extends X {
		 int b;
		 
		 Y(int i , int j){
			 super(j);
			 b=i;
		 }
		 
	 }




public class IncompatibleRef {

	public static void main(String[] args) {

		 X x = new X(10);
		  X x2;
		  Y y = new Y(5,6);
		  
		  x2 =x;// допустимо так как обе переменные одного типа
		  System.out.println("x2.a: " + x2.a);
		  
		  // в класе x известны только члены класса X
		  x2.a = 19;//допустпима
		  x2.b = 27;// ошибка, так как пременная b не является членом класса x
		 
	}

}
