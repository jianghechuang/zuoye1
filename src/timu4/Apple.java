package timu4;

public class Apple implements Product {

	private String name;
	private double weight;
	
	public Apple(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mai() {
		System.out.println("����һ������"+name+"��ƻ��С���飬����������"+weight+"��");
		
	}

}
