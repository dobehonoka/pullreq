package takahara;

public class Zombie extends Monster implements Human {

	String name;

	public void Yatagarasu(String name) {
		this.name = name;
		super.setHp(9999);
	}

	public void run(){
		System.out.println("�]���r�������Ă��܂��B");
	}

	public void attack(Monster monster) {
		System.out.println("�]���r�����݂��Ă��܂��B");
		monster.setHp(monster.getHp() - 800);
		if(monster.getHp() <= 0) {
			super.dead();
		}else {
			System.out.println(this.name + "�̎c��HP��" + monster.getHp() + "�ł��B");
		}
	}

}
