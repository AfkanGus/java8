package java8;

import javax.swing.JOptionPane;

public class Moon {
//Сила тяжести на Луне составляет около 17% земной. 
// Напишите программу, которая вычислила бы ваш вес на Луне
	public static void main(String[] args) {

		double vesnazemle;
		vesnazemle = 65;
		double vesnalune;
		vesnalune = 65 * 0.17;

		JOptionPane.showMessageDialog(null, vesnazemle + " zemnKG ravni " + vesnalune + " lunKG ");

	}

}
