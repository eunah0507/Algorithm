import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		int count = 0;
		
		for(int i = 0; i < num.length() - 3; i++) {
			if(num.charAt(i) == 'D' && num.charAt(i + 1) == 'K' && num.charAt(i + 2) == 'S' && num.charAt(i + 3) == 'H') {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}