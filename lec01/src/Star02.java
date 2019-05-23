
public class Star02 {

	public static void main(String[] args) {
		int i,j;
		int num = 7;
		for (i=0;i<num;i++) {
			if (i<num/2+1) {
				for (j=0;j<i+4;j++) {
					if (i+j>=3) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
					
				}
			}
			else {
				for (j=0;j<10-i;j++) {
					if (i-j<=3) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println();
		}

	}

}
