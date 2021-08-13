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
		System.out.println("这是一颗名叫"+name+"的苹果小精灵，它的重量是"+weight+"斤");
		
	}

}
