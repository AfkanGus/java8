package java8G6;
/*
 * ������������� ������� ���������� ��������� ����� 
 * ������ � �������� �����������
 */
public class VarArgs2_240 {
	//����� msg - ������� ��������,
	// a v - ������ ��������� ���������� �����
	static void vaTest(String msg, int ...v) {
		System.out.println(msg +v.length);
		System.out.println("����������: ");	
		for(int  i = 0; i< v.length; i++)
			System.out.println(" arg " + i + " :" + v[i]);
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest(" ���� �������� � �������: ", 10);
		vaTest(" ��� ��������� � �������: ",1,2,3);
		vaTest(" ���������� ��������� � ���� ������: ");
	}
}


