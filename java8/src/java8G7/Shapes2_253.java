package java8G7;

//Использование методов доступв для установкаи и получения значений закрытых членов

//Класс описывающий вдумерные объекты

class TwoDShope {
	private double width; // эти переменные
	private double height;// объявлены как закрытые

	// методы доступв к закрытым переменным экземпляра width height

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}// - методы доступа к переменным экземпляра width height

	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

	void showDim() {
		System.out.println(" Ширина и высота - " + width + " и " + height);
	}
}

//Подклас для представления треугольников наследуемый от класса TwoDShape
class Triangle extends TwoDShape {
	String style;

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Треугольник" + style);
	}
}

public class Shapes2_253 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = " Закрашенный";
		
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = " Контруный";

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
