package java8;

import javax.swing.JOptionPane;

//������������ ���������, ��������� � ���������� 1.2, ����� �������, �����
//��� �������� ������� �������������� ������ � �����.
//�������� �������� ���� �� 12 ����� ����� ������ ����. 
//����� ����� 12 ������ �������� ������
//������. (���� ���� �������������� ����� 39,37 �����.)
public class InchTometerTable {

	public static void main(String[] args) {

		double inches, meters;
		int counter;// ��������� � ������� ����� ���������� �������� �����(������� �����)

		counter = 0;
		for (inches = 1; inches <= 15; inches++) {
			meters = inches / 39.7;
			System.out.println(inches + "���� ����� " + meters + "������");
			// JOptionPane.showMessageDialog(null, inches + " ���� ����� " + meters + "
			// ������");

			counter++;
			// ������ 12-� ��������� ������ ������ ���� ������
			if (counter == 12) {
				JOptionPane.showMessageDialog(null, counter);
				System.out.println();
				counter = 0;// ����� �������� �����

			}

		}

	}
}
