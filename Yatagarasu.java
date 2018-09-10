package takahara;

public class Yatagarasu extends Monster implements Bird {
	
	String name;
	public Yatagarasu(String name) {
		this.name = name;
		super.setHp(2000);
	}

	public void run(){
		System.out.println("”ªš@‰G‚ª‘–‚Á‚Ä‚¢‚Ü‚·B");
	}

	public void attack(Monster monster) {
		System.out.println("”ªš@‰G‚ªŠš‚İ‚Â‚¢‚Ä‚¢‚Ü‚·B");
		monster.setHp(monster.getHp() - 1500);
		if(monster.getHp() <= 0) {
			super.dead();
		}else {
			System.out.println(this.name + "‚Ìc‚èHP‚Í" + monster.getHp() + "‚Å‚·B");
		}
	}
	

}
