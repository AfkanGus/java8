package java8G6;
//���������� ������������ �����
class StaticBlock {
	static double rootOf2;
	static double rootOf3;
	
	static {
		// ���� ���� ����������� ��� �������� ������
		System.out.println(" ������ ������������ ����");
		rootOf2=Math.sqrt(2.0);
		rootOf3=Math.sqrt(3.0);
	}
	StaticBlock(String msq) {
		System.out.println(msq);
	}
}
public class SDemo3_231 {

	public static void main(String[] args) {
		StaticBlock ob = new StaticBlock("������ �����������");
		
		System.out.println("������ ���������� �� 2 ����� "+ StaticBlock.rootOf2);
		System.out.println(" ������ ���������� �� 3 ���� " + StaticBlock.rootOf3);

	}

}
