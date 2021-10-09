
public class Test {

	public static void main(String[] args) {
		
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

		cell[5] = (char) cell[5];
		cell[5] = '\u24CE';
		System.out.println("-----------------------------------------");
		for(int i = 1, cnt = 0; i <= 100; i++) {
			System.out.printf("|%3d", cell[i-1]);
			cnt++;
			
			if(cnt%10==0) {
				System.out.print("|");
				System.out.println();
			}
		}
		System.out.println("------------------------------------------");
	}

}
