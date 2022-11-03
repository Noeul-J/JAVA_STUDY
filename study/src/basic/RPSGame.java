package basic;

import java.util.*;

public class RPSGame {
	public static void main(String[] args) {
		// 사용자가 낸 가위, 바위,보
       	Scanner sc = new Scanner(System.in);
       	String userRps = sc.next();
        System.out.println("사용자: " + userRps);

        // 컴퓨터가 낸 가위, 바위, 보
		String computerRps = "";
		Random random = new Random();
		int computer = random.nextInt(3);
		
		switch(computer){
			case 0:
	            computerRps = "가위";
	            break;
			case 1:
	            computerRps = "바위";
	            break;
			case 2:
	            computerRps = "보";
	            break;
	        default:
	        	break;
	    }

        System.out.println("컴퓨터: " + computerRps);
		
        // 승부 결정
	}

}
