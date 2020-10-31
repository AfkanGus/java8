package java8G5;

import javax.swing.JOptionPane;

//Напишите программу, в которой массив используется для нахожения среднего
//арифметического десяти значений типа douЫe. Используйте любые десять чисел.
public class Avg {
	// Среднее арифметическое 10 значений типа douЫe
	public static void main(String[] args) {
		double nums[] = { 1.1,1.2,2.2,2.3,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.1

	};
		double sum=0;
		
		for(int i=0; i<nums.length;i++)
			sum+=nums[i];
		
		System.out.println("Средние значение: " + sum / nums.length );
		
		
		JOptionPane.showMessageDialog(null,"Средние значение: " + sum / nums.length );

}
	
}
