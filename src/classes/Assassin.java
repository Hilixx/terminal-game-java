package classes;

public class Assassin extends Classes{
	
	
	public Assassin(String name) {
		super(name,250,120,200);
	}
	public void hability(Classes target) {
		target.hp -= 100;
	}
}
