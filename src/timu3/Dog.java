package timu3;

public class Dog extends Pet {

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String petName, String speakType) {
		super(petName, speakType);
		// TODO Auto-generated constructor stub
	}
	
	public  void speakInfo() {
		System.out.println("�����е�speakInfo����: ����:"+getPetName()+" ��������:"+getSpeakType());
	}
		
}
