package java8G7_254;

//ДОбавляем коструктор в класс Triangle
//Класс, описывающий двумерны массив
class TwoDShape {
	private double width;// теперь эти переменные объявлены как закрытые
	private double height;

	// методы доступа к переменным экземпляра width height
	double getWidth() {
		return width;
	} 

	double getHeight() {
		return height;
	}

	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

	void showDim() {
		System.out.println("Ширина и высота - " + width + " и " + height);
	}
}

//Подкласс для предоставления треугольников, производный от класса TwoDShape
class Triangle extends TwoDShape {
	private String style;

	// Конструктор
	Triangle(String s, double w, double h) {
		setWidth(w);
		setHeight(h);// Инициализация части объекта, соответсвущей классу TwoDShape

		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

public class Shapes3_254 {
	public static void main(String args[]) {
		Triangle t1 = new Triangle("Закрашенны", 4.0, 4.0);
		Triangle t2 = new Triangle("Контурны", 8.0, 12.0);

		System.out.println("Информация о t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("Площадь -" + t1.area());

		System.out.println();
		System.out.println("Информация о t2:");
		t2.showStyle();
		t2.showDim();
		System.out.println("Площадь -" + t2.area());

	}

}