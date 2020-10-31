package java8G7;

//������������� ������� ������� ��� ���������� � ��������� �������� �������� ������

//����� ����������� ��������� �������

class TwoDShope {
	private double width; // ��� ����������
	private double height;// ��������� ��� ��������

	// ������ ������� � �������� ���������� ���������� width height

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}// - ������ ������� � ���������� ���������� width height

	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

	void showDim() {
		System.out.println(" ������ � ������ - " + width + " � " + height);
	}
}

//������� ��� ������������� ������������� ����������� �� ������ TwoDShape
class Triangle extends TwoDShape {
	String style;

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("�����������" + style);
	}
}

public class Shapes2_253 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = " �����������";
		
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = " ���������";

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
