package java8G5;

import javax.swing.JOptionPane;

//import java.lang.StringIndexOutOfBoundsException;
//Расширье касс Encode такм образом, чтобы
//в качестве кюча шифрования использоваась строка из восьми символов

//Улучшенны вариант програм шифрования сообщений
//с помощью операции поразрядного исключающего ИЛИ

public class Encode {

	public static void main(String[] args) {
		
		String msg = "This is a test";
		String encmsg="";
		String decmsg="";
		String key ="abcdeifqw";
		int j;
		
		System.out.print(" Исходное сообщение: ");
		System.out.println("msg");
		
		
		// зашифровать сообщение
		j=0;
		for(int i=0; i<msg.length(); i++) {
			encmsg=encmsg+(char)(msg.charAt(i) ^ key.charAt(j));
			j++;
			if(j==8)j=0;
		}
		
		System.out.print("Зашифрованное сообщение:");
		System.out.println(decmsg);
		
		// дешифровать сообщение
		j=0;
		for(int i= 0; i<msg.length();i++) {
			decmsg=decmsg+(char)(encmsg.charAt(i)^ key.charAt(j));
			j++;
			if(j==8)j=0;
		}
		System.out.print("Дешифрованное сообщение: ");
		System.out.println(decmsg);
		
		String text="Исходное сообщение: "+encmsg;
		text=text+"\n"+"Зашифрованное сообщение:"+encmsg;
		text=text+"\n"+"Дешифрованное сообщение: "+ decmsg;
		JOptionPane.showMessageDialog(null, text);
		
	}

}
