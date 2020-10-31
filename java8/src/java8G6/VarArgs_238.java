package java8G6;
//ƒемонстраци€ использовани€ метода с пременным числом

public class VarArgs_238 {

	
	
	//ћетод vaTest() допускает переменное чилсо аргументов
	static void vaTest(int...v) {
		System.out.println(" оличество аргументов:" + v.length);
	
		System.out.println("—одержимое: ");

		for(int i=0;i<v.length;i++)
		System.out.println(" arg " + i + " : " +v[i]);
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
//ћетод vaText() может вызыватьс€ с переменным числом аргументов
		 vaTest(10); //1 аргумент
		 vaTest(1,2,3);// 3 аргумент
		 vaTest();// без аргументов
	}

}
