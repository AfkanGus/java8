package java8G6;

class StaticBlock1{
	static double rootOf2;
	static double rootOf3;
	 static {
		 //���� ���� ����������� ��� �������� ������
		 System.out.println("������ ������������ �����");
		 rootOf2 = Math.sqrt(2.0);
		 rootOf3 = Math.sqrt(3.0);
	 }
	 StaticBlock1(String msg){
		 System.out.println(msg);
	 }
}

public class SDemo3_2331 {

	public static void main(String[] args) {
		StaticBlock1 ob = new StaticBlock1("������ ������������");
		System.out.println("������ �������� �� 2 �����" + StaticBlock1.rootOf2 );
		System.out.println("������ ���������� �� 3 ����� " + StaticBlock1.rootOf3);

	}

}
