package timu6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dingyilei dy=new Dingyilei();
		//���÷�����ʱ��ʹ�ò��������ڲ���
		dy.service(new Shexiangtou(){
			public void service() {
				System.out.println("���������ڲ���");
			}
		});
		//ʹ�������ڲ�������ʵ�ֽӿ��еķ���
		USB s1=new USB() {
			public void service() {
				System.out.println("�����ڲ�������ʵ�ֽӿ��еķ���");
			}
		};
		s1.service();
		//ʹ��Lambda���ʽʵ�ֽӿ��еķ���
		USB s2=()-> System.out.println("����Lambda���ʽ");
		s2.service();
	}

}
