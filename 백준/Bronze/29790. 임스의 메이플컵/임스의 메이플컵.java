import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(num >= 1000) {
			if(a >= 8000 || b >= 260) {
				System.out.println("Very Good");
			}else {
				System.out.println("Good");
			}
		}else {
			System.out.println("Bad");
		}
		sc.close();
	}
}