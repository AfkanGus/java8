package java8G6;
//Перегрузка метода с переменным числом аргументов
// и неопределенность в выборе перегруженной версии.
//
//в этой прогармме имеется ошибка, и поэтому она не буде компелироваться
public class VarArgs4_243 {
static void vaTest(int...v) {
	//...
}
static void vaTest(boolean...v) {
	//...
}

	public static void main(String[] args) {

		vaTest(1,2,3);//ok
		vaTest(true,false,false);//ok
		//vaTest();//Ошибка: неопределенность вызова!
	}

}
