import java.util.Scanner;

public class Orange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int box, rest;
		System.out.println("오렌지의 개수를 입력하세요.");
		num = sc.nextInt();
		box = num / 10;
		rest = num % 10;
		
		System.out.println(box+"박스와 "+rest+"개남음.");

	}

}
