import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// A + B + C 구하기 
		
		Scanner sc = new Scanner(System.in);
		
		long A;
		A = sc.nextLong();
		
		long B;
		B = sc.nextLong(); 
		
		long C;
		C = sc.nextLong(); 
		
		long answer;
		
		answer = A+B+C;
		
		System.out.println(answer);
		
	}
}
