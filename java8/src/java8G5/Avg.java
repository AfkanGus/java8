package java8G5;

import javax.swing.JOptionPane;

//�������� ���������, � ������� ������ ������������ ��� ��������� ��������
//��������������� ������ �������� ���� dou�e. ����������� ����� ������ �����.
public class Avg {
	// ������� �������������� 10 �������� ���� dou�e
	public static void main(String[] args) {
		double nums[] = { 1.1,1.2,2.2,2.3,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1

	};
		double sum=0;
		
		for(int i=0; i<nums.length;i++)
			sum+=nums[i];
		
		System.out.println("������� ��������: " + sum / nums.length );
		
		
		JOptionPane.showMessageDialog(null,"������� ��������: " + sum / nums.length );

}
	
}
