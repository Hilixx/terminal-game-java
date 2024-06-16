package classes;

public class Mage extends Classes{

	public Mage(String name) {
		super(name,350,100,100);
	}
	public void hability(Classes target) {
		
		target.damage -= 50;
		target.hp -= 30;
		System.out.println("Dano e vida do inimigo reduzido, vida: " + target.hp + " dano: "+ target.damage);
	}
}
