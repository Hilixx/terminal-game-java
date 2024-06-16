package classes;

public class Warrior extends Classes{
	
	public Warrior(String name) {
		super(name,400,60,50);
	}
	
	public void hability(Classes target) {
		
		hp += 40;
		damage += 40;
		System.out.println("Ativou modo berserk" +" vida: " + hp + " dano: " +damage);
	}
	
	
	
}
