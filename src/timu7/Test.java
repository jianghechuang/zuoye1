package timu7;

public class Test {

	public static void main(String[] args)throws Sexjiance {
		// TODO Auto-generated method stub
		Person p=new Person();
		try {
			p.setSex('��');
		} catch (Sexjiance e) {
			// TODO Auto-generated catch block
			throw new Sexjiance("�Ա𲻺Ϸ�������");
		}
	}

}
