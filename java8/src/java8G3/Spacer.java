package java8G3;
//�������� ���������, ������� �������� �������,
//��������� � ����������, �� ��� ���, ���� �� ���������� �����. 
//������������ � ��������� ������� ��������.
//�������� � ���������� �������� ������ ��������� � 
//����� ���������.
import java.io.IOException;
//������� ��������
public class Spacer {

	public static void main(String[] args) throws java.io.IOException {
		 {
			char ch;
			int spacer =0;
			 System.out.println(" ��� ��������� ������� ������ �����.");		
			 
			int spaces =0;
			do {
				 ch =(char)System.in.read();
				 
				 if(ch ==' ') spaces++;
			 } while(ch!= '.');
		System.out.println(" ��������: " + spaces);
		}

	}
}


