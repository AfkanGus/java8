package java8G3;
//Напишите программу, которая получает символы,
//введенные с клавиатуры, до тех пор, пока не встретится точка. 
//Предумотрите в программе счетчик пробелов.
//Сведения о количестве пробелов должны выводитья в 
//конце программы.
import java.io.IOException;
//Подсчет пробелов
public class Spacer {

	public static void main(String[] args) throws java.io.IOException {
		 {
			char ch;
			int spacer =0;
			 System.out.println(" для остановки введите символ точки.");		
			 
			int spaces =0;
			do {
				 ch =(char)System.in.read();
				 
				 if(ch ==' ') spaces++;
			 } while(ch!= '.');
		System.out.println(" пробелол: " + spaces);
		}

	}
}


