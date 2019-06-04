public class EnemyMove extends Move{
	int h;
	int m;
	int s;
	public EnemyMove(int h,int s, int m)
{
		this.h = h;
		this.m = m;
		this.s = s;
		}
	
	public void action() {
		int t = (int)(Math.random()*3);
		if(t == 0) {
			h = h-3+s;
			m = m+3;
			System.out.println("U were attacked by a wild Ugandan Knuckles!!111\nU r left with " + h + " health and you gained 3 Jahcoins after defeating him. \nUr money is now "+m);
		} else if(t == 1) {
			h = h-5+s;
			m = m+4;
			System.out.println("U were attacked by a wild Big Chungus!!111\nU r left with " + h + " health and you gained 5 Jahcoins after defeating him. \nUr money is now "+m);
		}else if(t == 2) {
			h = h-10+s;
			m = m+10;
			System.out.println("U were attacked by a wild Thanos!!111 \nU r left with " + h + " health and you gained 10 Jahcoins after defeating him.\nUr money is now "+m);
		}
		if(h == 0) {
			System.out.println("YOU HAVE DIED");
			System.exit(0);
		}
	}
	
	public int updateh(){
		return h;
	}
	
	public int updatem(){
		return m;
	}
	
	public int updates(){
		return s;
	}
}
