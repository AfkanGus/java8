package java8G6;
//���������� ������ � ���������� ������ ����������

public class VarArgs3_241 {

	static void vaTest(int...v) {
		//������ ������ ������ vaTest()
		System.out.println("vaTest(int...): " + "���������� ���������: " + v.length);
	
		System.out.println(" ������������: ");
		for(int i=0; i<v.length;i++)
			System.out.println(" arg " + i + ":" + v[i]);
		System.out.println();
	}
	static void vaTest(boolean...v) {
		//������ ������ ������ vaTest()	
		System.out.println("vaTest(boolean ...): " + " ���������� ���������:" +v.length);
		
		System.out.println();
	}
	static void vaTest(String msg, int...v) {
		System.out.println("vaTest(String,int ..): " + msg+v.length)	;
		System.out.println(" ����������: ");
		for(int i=0; i<v.length; i++)
			System.out.println("arg" + i + ":" + v[i]);
		
		System.out.println();
	}
	public static void main(String[] args) {

		vaTest(1,2,3);
		vaTest(" ������������: ", 10, 20);
		vaTest(true,false,false);
	}

}
