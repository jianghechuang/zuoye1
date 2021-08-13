package timu6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dingyilei dy=new Dingyilei();
		//调用方法的时候使用参数匿名内部类
		dy.service(new Shexiangtou(){
			public void service() {
				System.out.println("参数匿名内部类");
			}
		});
		//使用匿名内部类重新实现接口中的方法
		USB s1=new USB() {
			public void service() {
				System.out.println("匿名内部类重新实现接口中的方法");
			}
		};
		s1.service();
		//使用Lambda表达式实现接口中的方法
		USB s2=()-> System.out.println("这是Lambda表达式");
		s2.service();
	}

}
