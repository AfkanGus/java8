package java8G6;

class StaticBlock1{
	static double rootOf2;
	static double rootOf3;
	 static {
		 //этот блок выпрлняется при загрузки класса
		 System.out.println("Внутри статического блока");
		 rootOf2 = Math.sqrt(2.0);
		 rootOf3 = Math.sqrt(3.0);
	 }
	 StaticBlock1(String msg){
		 System.out.println(msg);
	 }
}

public class SDemo3_2331 {

	public static void main(String[] args) {
		StaticBlock1 ob = new StaticBlock1("Внутри конструктора");
		System.out.println("Корень квадрата из 2 равен" + StaticBlock1.rootOf2 );
		System.out.println("Корень квадратный из 3 равен " + StaticBlock1.rootOf3);

	}

}
