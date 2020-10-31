package java8G6;
/*
 * использование массива аргументов перменной длины 
 * наряду с оюычными арнументами
 */
public class VarArgs2_240 {
	//здесь msg - одычный параметр,
	// a v - масиив параметрв переменной длины
	static void vaTest(String msg, int ...v) {
		System.out.println(msg +v.length);
		System.out.println("Содержимое: ");	
		for(int  i = 0; i< v.length; i++)
			System.out.println(" arg " + i + " :" + v[i]);
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest(" Один аргумент в массиве: ", 10);
		vaTest(" Три аргумента в массиве: ",1,2,3);
		vaTest(" Отсутсвуют аргументы в виде масива: ");
	}
}


