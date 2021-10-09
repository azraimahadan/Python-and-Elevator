import java.util.Scanner;

public class BoardGame {
	private Player player1 = null;
	private Player player2 = null;
	
	public BoardGame() {
		player1 = new Player("ADIB", '@', 0);
		player2 = new Player("SYAEDI", '$', 0);
	}
	
	private void showBoard()
	{
		if(player1 == null || player2 == null)
			return;
		
		player1.showBoard();
	}
	
	public void start() {
		if(player1 == null || player2 == null)
			return;
		
		Scanner start = new Scanner(System.in);
		start.nextLine();
		System.out.println("########## 주사위 놀이 준비 ##########");
		
		// PLAYER 1의 이름 입력받기
		System.out.print("PLAYER 1의 이름을 입력해 주세요. >> ");
		Scanner input_name1 = new Scanner(System.in);
		input_name1.next();
		
		// PLAYER 2의 이름 입력받기
		System.out.print("PLAYER 2의 이름을 입력해 주세요. >> ");
		Scanner input_name2 = new Scanner(System.in);
		input_name2.next();
		
		System.out.println("\n########## 주사위 놀이 시작 ##########");
		System.out.printf("%s(PLAYER 1)이 먼저 던진다면 true를 그렇지 않으면 false를 입력해 주세요. ", player1.getPlayer_Name());

		// 누가 먼저 시작하는 결정
		Scanner in = new Scanner(System.in);
		Boolean initiate = in.nextBoolean();
		
		showBoard();
		Scanner proceed = new Scanner(System.in);
		
			while(true) {
				if(initiate == true) {
					System.out.printf("%s: 주사위를 던집니다. (Enter 입력)\n", player1.getPlayer_Name());
					proceed.nextLine();
					player1.throwDice(player1);	
					showBoard();
					
					// PLAYER 1 이기는 처리
					if(player1.location >= 100) {
						System.out.printf("%s WIN!", player2.getPlayer_Name());
						break;
					}
					System.out.printf("%s: 주사위를 던집니다. (Enter 입력)\n", player2.getPlayer_Name());
					proceed.nextLine();
					player2.throwDice(player2);
					showBoard();
					
					// PLAYER 2 이기는 처리
					if(player2.location >= 100) {
						System.out.printf("%s WIN!", player2.getPlayer_Name());
						break;
					}
				} else {
					System.out.printf("%s: 주사위를 던집니다. (Enter 입력)\n", player2.getPlayer_Name());
					proceed.nextLine();
					player2.throwDice(player2);
					showBoard();
					
					// PLAYER 2 이기는 처리
					if(player2.location >= 100) {
						System.out.printf("%s WIN!", player2.getPlayer_Name());
						break;
					}
					
					System.out.printf("%s: 주사위를 던집니다. (Enter 입력)\n", player1.getPlayer_Name());
					proceed.nextLine();
					player1.throwDice(player1);	
					showBoard();
						
					if(player1.location >= 100) {
						System.out.printf("%s WIN!", player1.getPlayer_Name());
						break;
					}
				}
			}	
			in.close();
	}

	private void throwDice(Player player) {
		// TODO Auto-generated method stub
	}
}
