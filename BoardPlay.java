import java.util.Scanner;

public class BoardPlay {

	public static void main(String[] args) {
		System.out.println("########## �ֻ��� ���� ��� #########");
		System.out.println("�� �÷��̾ �ֻ��� ������ �մϴ�.");
		System.out.println("�ֻ����� ���ʷ� ������ 100�� ���� �����ϴ� ����� �̱�� �˴ϴ�.");
		System.out.println("ȭ��ǥ�� �ִ� ���� �����ϸ� ȭ��ǥ ������ �ö󰡰ų� �������� �˴ϴ�.");
		System.out.println("########## �ֻ��� ���� ��� ##########");
		System.out.println("������ �����Ϸ��� [Enter]�� ���� �ּ���.");
		
		BoardGame game = new BoardGame();
		game.start();
	
	}

}
