package takahara;

public class Yatagarasu extends Monster implements Bird {
	
	String name;
	public Yatagarasu(String name) {
		this.name = name;
		super.setHp(2000);
	}

	public void run(){
		System.out.println("���@�G�������Ă��܂��B");
	}

	public void attack(Monster monster) {
		System.out.println("���@�G�����݂��Ă��܂��B");
		monster.setHp(monster.getHp() - 1500);
		if(monster.getHp() <= 0) {
			super.dead();
		}else {
			System.out.println(this.name + "�̎c��HP��" + monster.getHp() + "�ł��B");
		}
	}
	

}
