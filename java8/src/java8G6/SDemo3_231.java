package java8G6;
//применение статического блока
class StaticBlock {
	static double rootOf2;
	static double rootOf3;
	
	static {
		// этот блок выполн€етс€ при загрузке класса
		System.out.println(" ¬нутри статического блок");
		rootOf2=Math.sqrt(2.0);
		rootOf3=Math.sqrt(3.0);
	}
	StaticBlock(String msq) {
		System.out.println(msq);
	}
}
public class SDemo3_231 {

	public static void main(String[] args) {
		StaticBlock ob = new StaticBlock("¬нутри коструктора");
		
		System.out.println(" орень квадратный из 2 равен "+ StaticBlock.rootOf2);
		System.out.println("  орень квадратный из 3 рвен " + StaticBlock.rootOf3);

	}

}
