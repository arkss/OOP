import java.util.Scanner;

public class star01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i,j;
		System.out.println("별 삼각형의 높이의 길이는?");
		num = sc.nextInt();
		
		for (i=0;i<num;i++) {
			for(j=0;j<i+num;j++) {
				if (i+j >= num-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
