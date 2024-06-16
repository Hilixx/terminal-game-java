package classes;

public abstract class Classes {
	
	protected String name;
	protected int hp;
	public int damage;
	public int speed;
	
	
	public Classes(String name, int hp, int damage, int speed) {
		super();
		this.name = name;
		this.hp = hp;
		this.damage = damage;
		this.speed = speed;
	}



	public Classes() {
		
	}
	
	

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public int getSpeed() {
		return speed;
	}
	public String getName() {
		return name;
	}
	
	public int attack(Classes target) {
		return target.hp -= damage;
		
	}
	public abstract void  hability(Classes target);
	

}
