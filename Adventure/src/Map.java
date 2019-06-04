import java.util.Arrays;

public class Map {
	int[][] map = new int[6][9];
	public Map(){
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[0].length; j++) {
				map[i][j] = 7;
			}
		}
		map[4][4] = 2;
	}
	public void create() {
		createWin();
		for(int i = 0; i < 7; i++) {
			createEnemy();
		}
	for(int j = 0; j < 7; j++) {
		createTreasure();
		}
	for(int k = 0; k < 7; k++) {
		createShop();
	}
		createNormal();
	}
	
	public void createEnemy() {
		int x = (int)(Math.random()*6);
		int y = (int)(Math.random()*9);
		if(map[x][y] == 7) {
			map[x][y] = 9;
		}
	}
	
	public void createTreasure() {
		int x = (int)(Math.random()*6);
		int y = (int)(Math.random()*9);
		if(map[x][y] == 7) {
			map[x][y] = 1;
		}
	}
	
	public void createShop() {
		int x = (int)(Math.random()*6);
		int y = (int)(Math.random()*9);
		if(map[x][y] == 7) {
			map[x][y] = 5;
		}
	}
	
	public void createNormal() {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 9; j++) {
				if(map[i][j] == 7) {
					map[i][j] = 8;
				}
			}
		}
	}
	
	public void createWin() {
		int x = (int)(Math.random()*6);
		int y = (int)(Math.random()*9);
		if(map[x][y] == 7) {
			map[x][y] = 0;
		}
	}

	public void print() {
		System.out.println(Arrays.deepToString(map));
//		for(int r = 0; r < map.length; r++) {
//			for(int c = 0; c < map[0].length; c++) {
//				System.out.print(map[r][c] + " ");
//		}
//	}	
	}
	
	public int getNum(int r, int c) {
		return map[r][c];
	}
	}
