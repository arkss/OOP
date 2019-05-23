import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c, sum;
		
		System.out.print("첫번째 값:");
		a = sc.nextInt();
		System.out.print("두번째 값:");
		b = sc.nextInt();
		System.out.print("세번째 값:");
		c = sc.nextInt();
		sum = a+b+c;
		System.out.println(sum);
		

	}

}
