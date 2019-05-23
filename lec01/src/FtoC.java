import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		double f,c ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("화씨 온도를 입력하세요.");
		f = sc.nextDouble();
		
		c = 5.0 / 9.0 * (f-32);
		
		System.out.println(c);

	}

}
