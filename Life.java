package takahara;

public abstract class Life {

	private int hp;

	public void dead() {
		System.out.println("‚ ‚È‚½‚Í€‚É‚Ü‚µ‚½B");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
