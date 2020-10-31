package java8G5;
//Измените программу, созданную в упранении 5.1, такм образом, 
//чтобы она сортироваа массив строк. Продемонстрируте ее работоспособность.

//Демонстрация пузырьковой сортировки строк
public class StrBubble {

	public static void main(String[] args) {

		String strs[] = {
				"this", "is" , "а", "test" ,
				"of", "а", "string", "sort"
				
		};
		int a,b;
		String t;
		int size;
		
		size = size = strs.length;//количество сортруемых элементов
		
		// Отобразить исходный массив
		System.out.println("ИСходный массив:");
		for(int i=0; i<size; i++)
			System.out.print(" " + strs[i]);
		System.out.println();
		
		
		
		// Пузырьковая сортировка строк
		for(a=1; a<size;a++)
			for(b=size-1;b>=a;b--) {
				// поменять элементы местами при нарушении
				// порядка их следования
				
				if(strs[b-1].compareTo(strs[b])>0) {
					t=strs[b-1];
					strs[b-1]=strs[b];
					strs[b]=t;
				}
			}
		
		
		// Отобразить отсортированны массив
		System.out.print("Oтcopтиpoвaнный массив:");
		for(int i=0; i < size; i++)
		System.out.print(" " + strs[i]);
		System.out.println();
		
		
		
		
	}

}
