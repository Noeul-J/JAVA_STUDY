package basic;

import java.util.*;

public class RPSGame {
	public static void main(String[] args) {
		Scanner userRps = new Scanner(System.in);
		String computerRps;
		Random random = new Random();
		Integer computer = random.nextInt(3);
		
		Switch(computer){
			case 0:
	            System. out.println("1" );
	            break;
			case 1:
	            System. out.println("2" );
	            break;
			case 2:
	            System. out.println("3" );
	            break;
			default:
	            System. out.println("else" );
	            break;
	     }
		
	}

}
