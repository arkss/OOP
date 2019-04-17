import java.util.Scanner;

class Theater {
	
	private int[] Alist = new int[10];
	private int[] Blist = new int[10];
	private String result;
	private String name;
	
	public Theater(){
		for (int i =0;i<10;i++) {
			Alist[i] = 0;
			Blist[i] = 0;
		}
		name = "";
	}
	
	public Theater(String name){
		this.name = name;
	}
	
	String getResult() {
		return result;
	}
	
	String getName() {
		return name;
	}
	
	// 조회
	void lookup() {
		System.out.println("-------------------------");
		System.out.println("    1 2 3 4 5 6 7 8 9 10");
		System.out.println("-------------------------");
		System.out.print("A석: ");
		for (int item:Alist) {
			System.out.print(item+" ");
		}
		System.out.println(" ");
		System.out.println("-------------------------");
		System.out.print("B석: ");
		for (int item:Blist) {
			System.out.print(item+" ");
		}	
		System.out.println(" ");
		System.out.println("-------------------------");
	}
	
	// 좌석 예약받기
	void setList(int seatRating, int index) {
		if (seatRating == 1) {
			if (Alist[index-1]==1) {
				result = "이미 예약이 되있습니다.";
				return;
			}
			Alist[index-1] = 1;
			System.out.println("-------------------------");
			System.out.println("    1 2 3 4 5 6 7 8 9 10");
			System.out.println("-------------------------");
			System.out.print("A석: ");
			for (int item:Alist) {
				System.out.print(item+" ");
			}
			System.out.println(" ");
			System.out.println("-------------------------");
		}
		else if (seatRating == 2) {
			if (Blist[index-1]==1) {
				result = "이미 예약이 되있습니다.";
				return;
			}
			Blist[index-1] = 1;
			System.out.println("-------------------------");
			System.out.println("    1 2 3 4 5 6 7 8 9 10");
			System.out.println("-------------------------");
			System.out.print("B석: ");
			for (int item:Blist) {
				System.out.print(item+" ");
			}
			System.out.println(" ");
			System.out.println("-------------------------");
		}
		result = "예약되었습니다.";
		
		
	}
	
	// 좌석 취소하기
	void cancelList(int seatRating, int index) {
		if (seatRating == 1) {
			if (Alist[index-1] == 0) {
				result = "취소할 예약이 없습니다.";
				return;
			}
			Alist[index-1] = 0;
			System.out.println("-------------------------");
			System.out.println("    1 2 3 4 5 6 7 8 9 10");
			System.out.println("-------------------------");
			System.out.print("A석: ");
			for (int item:Alist) {
				System.out.print(item+" ");
			}
			System.out.println(" ");
			System.out.println("-------------------------");
		}
		else if (seatRating == 2) {
			if (Blist[index-1] == 0) {
				result = "취소할 예약이 없습니다.";
				return;
			}
			Blist[index-1] = 0;
			System.out.println("-------------------------");
			System.out.println("    1 2 3 4 5 6 7 8 9 10");
			System.out.println("-------------------------");
			System.out.print("B석: ");
			for (int item:Blist) {
				System.out.print(item+" ");
			}
			System.out.println(" ");
			System.out.println("-------------------------");
		}
		
		result = "취소되었습니다.";
		
	}
	
	// 정보받기
	void getInfo(int check) {
		Scanner sc = new Scanner(System.in);
		int seatRating;
		int seatNum;
		System.out.println("좌석 등급을 선택하세요(A석:1 B석:2)");
		while (true) {
			seatRating = sc.nextInt();
			if (seatRating == 1 || seatRating == 2)
				break;
			System.out.println("좌석등급을 다시 입력해주세요.");
		}
		
		System.out.print("좌석 번호를 선택하세요(1~10):");
		while (true) {
			seatNum = sc.nextInt();
			if (seatNum >= 1 && seatNum <= 10)
				break;
			System.out.println("좌석번호를 다시 입력해주세요.");
		}
		
		
		if (check == 1) {
			setList(seatRating, seatNum);
		}
		else if (check == 3) {
			cancelList(seatRating, seatNum);
		}
		
	}
	
	
}


public class TheaterTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Theater t1 = new Theater("민성이");
		
		boolean flag = true; // 프로그램을 계속 할지에 대한 boolean
		while (flag) {
			System.out.println(t1.getName()+"극장 좌석 예약 시스템입니다.");
			System.out.println("번호를 선택하세요(예약:1, 조회:2, 취소:3, 끝내기:4)");
			int input;
			while (true) {
				input = sc.nextInt();
				if (input == 1 || input == 2 || input == 3 || input == 4 )
					break;
				System.out.println("번호를 다시 입력하세요.");
			}
			
			switch(input)
			{
			case 1:
				System.out.println("좌석 예약 현황입니다. (빈좌석:0, 예약좌석:1)");
				t1.lookup();
				System.out.println("좌석 예약을 진행합니다.");
				t1.getInfo(input);
				System.out.println(t1.getResult());
				break;
				
			case 2:
				t1.lookup();
				break;
				
			case 3:
				System.out.println("좌석 예약 현황입니다. (빈좌석:0, 예약좌석:1)");
				t1.lookup();
				System.out.println("좌석 취소를 진행합니다.");
				t1.getInfo(input);
				System.out.println(t1.getResult());
				break;
				
			case 4:
				flag = false;
				break;
				
			}
			
		}
		
		
	}

}
