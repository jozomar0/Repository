
public class ShopMove extends Move{
	int h;
	int m;
	int s;
	public ShopMove(int h,int s, int m)
{
		this.h = h;
		this.m = m;
		this.s = s;
		}
	public void action() {
		m--;
		h++;
		if(m > 0) {
			System.out.println("U found the supreme store. \nU decided to waste 1 Jahcoin for 1 hp.\nUr money is now "+m+" and ur hp is now "+h);
		} else {
			System.out.println("U found the supreme store.\nU have no money tho. too bad.");
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
