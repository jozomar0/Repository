public class Move {

	public Move()
{

		}
	public void action() {
		System.out.println("There is nothing here except for a bunch of grass.");
	}
	public boolean canMove(String z,int x,int y) {
		if(z.contentEquals("l")) {
			y = y-1;
			if(y<0) {
				return false;
			}else{
				return true;
			}
		} else if(z.contentEquals("r")) {
			y = y+1;
			if(y>8) {
				return false;
			}else{
				return true;
			}
		} else if(z.contentEquals("f")) {
			x = x-1;
			if(x<0) {
				return false;
			}else{
				return true;
			}
		} else {
			x = x+1;
			if(x>5) {
				return false;
			}else{
				return true;
			}
		}
	}
}
