package java8G7;
//обобщенная двумерная фигура
class TwoDShape{
	 double width;
	double height;
	
	// отображает стиль оформления треугольника
	void showDim() {
		System.out.println("Ширина и высота - "+ width+" и " + height);
	}
}

class Triangle extends TwoDShape{
	// переменная хранящая стиль оформления треугольника
	String style;
	//вычисляет и возвращает площадь треугольника
	 double area() {
		 return width*height /2;
	 }
	 // метод отобржающий стиль  оформления треугльника
	 void showStyle() {
		 System.out.println(" Треугольник " + style);
	 }
	   
}
public class Shapes {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.width =4.0;
		t1.height=4.0;
		t1.style= " Закрашенный";
		
		t2.width=8.0;
		t2.height=12.0;
		t2.style=" Контруный";
		
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













