package timu1;

public class InstrumentTest {

	public static void main(String[] args) {
		Instrument sm=new Instrument();
		//��������ָ���������
		sm.testPlay(new Piano());
		sm.testPlay(new Violin());
	}

}
