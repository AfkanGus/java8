package java8G5;

import javax.swing.JOptionPane;

//import java.lang.StringIndexOutOfBoundsException;
//�������� ���� Encode ���� �������, �����
//� �������� ���� ���������� ������������� ������ �� ������ ��������

//��������� ������� ������� ���������� ���������
//� ������� �������� ������������ ������������ ���

public class Encode {

	public static void main(String[] args) {
		
		String msg = "This is a test";
		String encmsg="";
		String decmsg="";
		String key ="abcdeifqw";
		int j;
		
		System.out.print(" �������� ���������: ");
		System.out.println("msg");
		
		
		// ����������� ���������
		j=0;
		for(int i=0; i<msg.length(); i++) {
			encmsg=encmsg+(char)(msg.charAt(i) ^ key.charAt(j));
			j++;
			if(j==8)j=0;
		}
		
		System.out.print("������������� ���������:");
		System.out.println(decmsg);
		
		// ����������� ���������
		j=0;
		for(int i= 0; i<msg.length();i++) {
			decmsg=decmsg+(char)(encmsg.charAt(i)^ key.charAt(j));
			j++;
			if(j==8)j=0;
		}
		System.out.print("������������� ���������: ");
		System.out.println(decmsg);
		
		String text="�������� ���������: "+encmsg;
		text=text+"\n"+"������������� ���������:"+encmsg;
		text=text+"\n"+"������������� ���������: "+ decmsg;
		JOptionPane.showMessageDialog(null, text);
		
	}

}
