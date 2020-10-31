package java8G6;
//������������������ ����� �������, ���������������
//��� �������� ���������� ��������
public class Gueue {
	
	private char q[];// ������ ��� �������� ��������� �������
	private int putloc, getloc;// ������� ��� ������� � ���������� ��������� �������
	
	Gueue(int size){
		q = new char[size+1];// �������� ������ ��� �������
		putloc=getloc=0;
	}
	// ��������� ������ � �������
	void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println("-������� ���������");
			return;
		}
		putloc++;
		q[putloc]=ch;
		
	}
	// ������� ������ �� �������
	char get() {
		if(getloc==putloc) {
			System.out.println("-������� �����");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}	

}
