package java8G2;

import javax.swing.JOptionPane;

//Ќапишите программу, котора€ находила бы 
//простые числа в пределах от 2 до 100
public class Prime {

	public static void main(String[] args) {

		int i,j;
		boolean isprime;
		int counter = 0;
		
		for(i=2; i<100; i++) {
			 isprime = true;
			 
			 //проверить,делитс€ ли число без остатка
			 
			 for(j=2; j<=i/j; j++)
				 //если число делитс€ без остатка,значит оно не простое
				 if((i%j) ==0) isprime = false;
			 
			 if(isprime)
				 System.out.println(i+ " - простое число.");
			 
			 counter++;
				//  ажда€ 3-€ выводима€ строка должна быть пустой
				if (counter == 3) {
					//JOptionPane.showMessageDialog(null, counter);
					System.out.println();
					counter = 0;// сброс счетчика строк
		}
}
}
}