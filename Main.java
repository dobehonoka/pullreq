package takahara;

public class Main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		Yatagarasu yatagarasuA = new Yatagarasu("���@�GA");
		Yatagarasu yatagarasuB = new Yatagarasu("���@�GB");
		Zombie zombieA = new Zombie();


		zombieA.attack(yatagarasuB);
		zombieA.attack(yatagarasuB);
		zombieA.attack(yatagarasuB);
	}

}
