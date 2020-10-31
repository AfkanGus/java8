package java8G6;
//Перегрузка метода с переменным числом аргументов

public class VarArgs3_241 {

	static void vaTest(int...v) {
		//Первая версия метода vaTest()
		System.out.println("vaTest(int...): " + "Количество аргуметом: " + v.length);
	
		System.out.println(" Содержанимое: ");
		for(int i=0; i<v.length;i++)
			System.out.println(" arg " + i + ":" + v[i]);
		System.out.println();
	}
	static void vaTest(boolean...v) {
		//Вторая версия метода vaTest()	
		System.out.println("vaTest(boolean ...): " + " Количество аргуметов:" +v.length);
		
		System.out.println();
	}
	static void vaTest(String msg, int...v) {
		System.out.println("vaTest(String,int ..): " + msg+v.length)	;
		System.out.println(" Содержимое: ");
		for(int i=0; i<v.length; i++)
			System.out.println("arg" + i + ":" + v[i]);
		
		System.out.println();
	}
	public static void main(String[] args) {

		vaTest(1,2,3);
		vaTest(" Тестирование: ", 10, 20);
		vaTest(true,false,false);
	}

}
