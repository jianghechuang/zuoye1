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
		System.out.println("����һͷ����"+name+"��������������"+weight+"��");
		
	}

}
