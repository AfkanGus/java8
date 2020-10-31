package java8G6;

//Простой пример рекурсии
class Factorial {
	// Рекурсивый метод
	int factR(int n) {
		int result;

		if (n == 1)
			return 1;
		result = factR(n - 1) * n;// (n-1) рекурсивыный вызов тодода factR()
		return result;
	}

	// Вариант программ, вычисляющий факториал итеративны способом
	int factI(int n) {
		int t, result;

		result = 1;
		for (t = 1; t <= n; t++)
			result *= t;
		return result;
	}
}
public class Recursion_226 {

	public static void main(String[] args) {

		Factorial f = new Factorial();
		System.out.println(" Вычисление рекурсивным методом");
		System.out.println("Factorial 3 = " + f.factR(3));           
		System.out.println("Factorial 4 = " + f.factR(4));
		System.out.println("Factorial 5 = " + f.factR(5));
		System.out.println();

		System.out.println("Bычиcлeниe итеративны методом");
		System.out.println("Factorial 3 = " + f.factI(3));
		System.out.println("Factorial 4 = " + f.factI(4));
		System.out.println("Factorial 5 = " + f.factI(5));
	}
}
