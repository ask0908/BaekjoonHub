import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt(); // 시
		int minute = in.nextInt(); // 분
		in.close();
		
		if(minute < 45) {
			hour--;		// 시(hour) 1 감소
			minute = 60 - (45 - minute); 	// 분(min) 감소
			if(hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + minute);
		}
		else {
			System.out.println(hour + " " + (minute - 45));
		}
	}
}