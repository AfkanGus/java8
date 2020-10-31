package java8G6;
//Усовершенствованны класс очереди, предназначенной
//для хранения символьных значений
public class Gueue {
	
	private char q[];// массив для хранения элементов очереди
	private int putloc, getloc;// индексы для вставки и извлечения элементов очереди
	
	Gueue(int size){
		q = new char[size+1];// выделить память для очереди
		putloc=getloc=0;
	}
	// Поместить символ в очередь
	void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println("-Очередь заподнена");
			return;
		}
		putloc++;
		q[putloc]=ch;
		
	}
	// Извлечь символ из очереди
	char get() {
		if(getloc==putloc) {
			System.out.println("-Очередь пуста");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}	

}
