package java8G6;

/*
 * ¬плоть до этого момента в приводимых примерах программ при передаче параметрв 
 * методам использоваись лишь простые типы. Ќо параметрами могут быть и объекты. 
 * Ќапример, в приведенной ниже программе определен касс Block, предназначенный 
 * дя хранени€ размеров параелепипеда в трех измерени€х.*/
public class PassOb {

	public static void main(String[] args) {

		Block ob1 = new Block(10, 2, 5);

		Block ob2 = new Block(10, 2, 5);

		Block ob3 = new Block(4, 5, 5);

		System.out.println("ob1 имеет те же размеры, что и о№2: " + ob1.sameBlock(ob2));

		System.out.println("ob1 имеет тот же объем, что и о№«: " + ob1.sameVolume(ob3));

	}

}

//ћетодам можо передавать объекты
class Block {
	int a, b, c;
	int volume;

	Block(int i, int j, int k) {
		a = j;
		b = j;
		c = k;
		volume = a * b * c;

	}

	// ¬ернуть логическое значение true, если
	// параметр о№ определ€ет тот же параллелепипед
	Boolean sameBlock(Block ob) {
		if ((ob.a == a) & (ob.b == b) & (ob.c == c))
			return true;
		else
			return false;
	}

	// ¬ернуть логическое значение true, если
	// параметр о№ определ€ет параллелепипед того же объема
	boolean sameVolume(Block ob) {
		if (ob.volume == volume)
			return true;
		else
			return false;
	}

}