import java.util.Scanner;

public class BoardPlay {

	public static void main(String[] args) {
		System.out.println("########## 주사위 놀이 방법 #########");
		System.out.println("두 플레이어가 주사위 게임을 합니다.");
		System.out.println("주사위를 차례로 던져서 100에 먼저 도착하는 사람이 이기게 됩니다.");
		System.out.println("화살표가 있는 곳에 도달하면 화살표 방향대로 올라가거나 내려오게 됩니다.");
		System.out.println("########## 주사위 놀이 방법 ##########");
		System.out.println("게임을 시작하려면 [Enter]를 눌러 주세요.");
		
		BoardGame game = new BoardGame();
		game.start();
	
	}

}
