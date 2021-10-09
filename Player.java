public class Player {
	public String player_name;
	private char sign;
	public int location;
	
	public String getPlayer_Name() {
		return player_name;
	}
	
	Player(String player_name, char sign, int location)
	{
		this.player_name = player_name;
		this.sign = sign;
		this.location = location;
	}
	
	void showBoard()
	{
		int[] cell = new int[100];
		
		System.out.println("-----------------------------------------");
		for(int i = 1, cnt = 0; i <= 100; i++) {
			cell[i-1] = i;
			System.out.printf("|%3d", cell[i-1]);
			cnt++;
			
			if(cnt%10==0) {
				System.out.print("|");
				System.out.println();
			}
		}
		System.out.println("------------------------------------------");
		
	}
	
	int throwDice(Player gamePlayer)
	{
		int dice_no = (int)(Math.random()*6 + 1);
		System.out.printf("%s의 주사위수: %d\n", player_name, dice_no);
		System.out.printf("%d로 정상 이동합니다!!\n", dice_no);
		
		return gamePlayer.move(dice_no);
	}
	
	int move(int dice_no)
	{
		location += dice_no;
		
		return location;
	}
		
}
