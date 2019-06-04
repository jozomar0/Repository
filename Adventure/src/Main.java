import java.util.Scanner;

public class Main {


	public static void main(String[] args)
	{
		System.out.println("For some reason u r in the middle of nowhere. \nI don't know how u got here but OK.\nWell, the NBA finals r gonna start soon, and u know, we gotta watch the Raptors win. \nYou can enter l to move left, r to move right, f to move forward, and b to move backwards.");
		int hp = 20;
		int sword = 0;
		int money = 20;
		int r = 4;
		int c = 4;
		Map m = new Map();
		m.create();
//		m.print();
		Scanner input = new Scanner(System.in);
		String command = "";
		Move mv = new Move();

		while(!command.equals("quit")) {
			System.out.println("Enter Command");
			command = input.nextLine();	
			
			if(mv.canMove(command, r, c)) {
				if(command.contentEquals("l")) {
					c = c-1;

				} else if(command.contentEquals("r")) {
					c = c+1;

				} else if(command.contentEquals("f")) {
					r = r-1;
		
				} else {
					r = r+1;

			}
			}else {
				System.out.println("There is unfortunately a great magnificent brick wall blocking your path. \nU should try a different direction." );
				continue;
			}
			

				System.out.println(r+" "+ c);
					if(m.getNum(r, c) == 9) {
						EnemyMove b = new EnemyMove(hp, sword, money);
						b.action();
						hp = b.updateh();
						money = b.updatem();
						sword = b.updates();
					} else if(m.getNum(r, c) == 1) {
						TreasureMove b = new TreasureMove(hp, sword, money);
						b.action();
						hp = b.updateh();
						money = b.updatem();
						sword = b.updates();
					}else if(m.getNum(r, c) == 5) {
						ShopMove b = new ShopMove(hp, sword, money);
						b.action();
						hp = b.updateh();
						money = b.updatem();
						sword = b.updates();
					} else if(m.getNum(r, c) == 8) {
						Move b = new Move();
						b.action();
					} else if(m.getNum(r, c) == 2){
						System.out.println("You are back at your starting spot. \nStop goofing around, u will miss the NBA finals. -_-");
					}else {
						System.out.println("You found ur way home!!1 Just in time for the NBA finals, good job. \nfollow @josh_got_u_bro on instagram.");
						System.exit(0);
					}
				

			
		}
	}

}

