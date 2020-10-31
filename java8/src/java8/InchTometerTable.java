package java8;

import javax.swing.JOptionPane;

//Видоизмените программу, созданную в упражнении 1.2, таким образом, чтобы
//она выводила таблицу преобразования дюймов в метры.
//Выведите значения дины до 12 футов через каждый дюйм. 
//После кажых 12 дюймов выведите пустую
//строку. (Один метр приблизительно равен 39,37 дюйма.)
public class InchTometerTable {

	public static void main(String[] args) {

		double inches, meters;
		int counter;// перменная в которую бутет помешаться значения длины(счетчик строк)

		counter = 0;
		for (inches = 1; inches <= 15; inches++) {
			meters = inches / 39.7;
			System.out.println(inches + "дюйм равно " + meters + "метров");
			// JOptionPane.showMessageDialog(null, inches + " дюйм равно " + meters + "
			// метров");

			counter++;
			// Каждая 12-я выводимая строка должна быть пустой
			if (counter == 12) {
				JOptionPane.showMessageDialog(null, counter);
				System.out.println();
				counter = 0;// сброс счетчика строк

			}

		}

	}
}
