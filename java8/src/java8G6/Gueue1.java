package java8G6;
//������������������ ����� �������, ���������������
//��� �������� ���������� ��������
public class Gueue1 {
	public static void main(String[] args) {
Gueue1 test = new Gueue1(10);
test.q[0]=99;
test.putloc=100;
	}
	//������������������ ����� �������, ���������������
	//��� �������� ���������� ��������	
		private char q[];// ������ ��� �������� ��������� �������
		private int putloc, getloc;// ������� ��� ������� � ���������� ��������� �������
		
		Gueue1(int size){
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

