package java8G2;

import javax.swing.JOptionPane;

//�������� ���������, ������� �������� �� 
//������� ����� � �������� �� 2 �� 100
public class Prime {

	public static void main(String[] args) {

		int i,j;
		boolean isprime;
		int counter = 0;
		
		for(i=2; i<100; i++) {
			 isprime = true;
			 
			 //���������,������� �� ����� ��� �������
			 
			 for(j=2; j<=i/j; j++)
				 //���� ����� ������� ��� �������,������ ��� �� �������
				 if((i%j) ==0) isprime = false;
			 
			 if(isprime)
				 System.out.println(i+ " - ������� �����.");
			 
			 counter++;
				// ������ 3-� ��������� ������ ������ ���� ������
				if (counter == 3) {
					//JOptionPane.showMessageDialog(null, counter);
					System.out.println();
					counter = 0;// ����� �������� �����
		}
}
}
}