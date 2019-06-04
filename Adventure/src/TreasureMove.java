public class TreasureMove extends Move{
	int h;
	int m;
	int s;
	public TreasureMove(int h,int s, int m)
{
		this.h = h;
		this.m = m;
		this.s = s;
		}

		public void action() {
			s++;
			System.out.println("You found a diamond sword. \nYou can now fight off enemies faster and escape battles with less damage. \nUr sword power is "+s);


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

