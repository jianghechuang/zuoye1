package timu3;

public class Test {

	public static void main(String[] arr) {
		Pet p = new Pet();
		p.speakInfo();
		
		Pet d1 = new Dog("С����","������");
		d1.speakInfo();
		Pet d2 = new Dog("С��è","������");
		d2.speakInfo();
	}
}
