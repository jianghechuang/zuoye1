package timu1;

public class InstrumentTest {

	public static void main(String[] args) {
		Instrument sm=new Instrument();
		//父类引用指向子类对象
		sm.testPlay(new Piano());
		sm.testPlay(new Violin());
	}

}
