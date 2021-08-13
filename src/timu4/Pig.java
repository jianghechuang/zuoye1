package timu4;

public class Pig implements Product {
	private String name;
	private double weight;
	
	public Pig(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public Pig() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mai() {
		System.out.println("这是一头名叫"+name+"的猪，它的重量是"+weight+"斤");
		
	}

}
