package java8G7_254;

//��������� ���������� � ����� Triangle
//�����, ����������� �������� ������
class TwoDShape {
	private double width;// ������ ��� ���������� ��������� ��� ��������
	private double height;

	// ������ ������� � ���������� ���������� width height
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
		System.out.println("������ � ������ - " + width + " � " + height);
	}
}

//�������� ��� �������������� �������������, ����������� �� ������ TwoDShape
class Triangle extends TwoDShape {
	private String style;

	// �����������
	Triangle(String s, double w, double h) {
		setWidth(w);
		setHeight(h);// ������������� ����� �������, ������������� ������ TwoDShape

		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("����������� " + style);
	}
}

public class Shapes3_254 {
	public static void main(String args[]) {
		Triangle t1 = new Triangle("����������", 4.0, 4.0);
		Triangle t2 = new Triangle("��������", 8.0, 12.0);

		System.out.println("���������� � t1: ");
		t1.showDim();
		t1.showStyle();
		System.out.println("������� -" + t1.area());

		System.out.println();
		System.out.println("���������� � t2:");
		t2.showStyle();
		t2.showDim();
		System.out.println("������� -" + t2.area());

	}

}