package java8G5;
//�������� ���������, ��������� � ��������� 5.1, ���� �������, 
//����� ��� ���������� ������ �����. ���������������� �� �����������������.

//������������ ����������� ���������� �����
public class StrBubble {

	public static void main(String[] args) {

		String strs[] = {
				"this", "is" , "�", "test" ,
				"of", "�", "string", "sort"
				
		};
		int a,b;
		String t;
		int size;
		
		size = size = strs.length;//���������� ���������� ���������
		
		// ���������� �������� ������
		System.out.println("�������� ������:");
		for(int i=0; i<size; i++)
			System.out.print(" " + strs[i]);
		System.out.println();
		
		
		
		// ����������� ���������� �����
		for(a=1; a<size;a++)
			for(b=size-1;b>=a;b--) {
				// �������� �������� ������� ��� ���������
				// ������� �� ����������
				
				if(strs[b-1].compareTo(strs[b])>0) {
					t=strs[b-1];
					strs[b-1]=strs[b];
					strs[b]=t;
				}
			}
		
		
		// ���������� �������������� ������
		System.out.print("O�cop��po�a���� ������:");
		for(int i=0; i < size; i++)
		System.out.print(" " + strs[i]);
		System.out.println();
		
		
		
		
	}

}
