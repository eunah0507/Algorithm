import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 윤년이면 1, 아니면 0 출력하기
		
		  Scanner sc = new Scanner(System.in);
		  
		  int A = sc.nextInt();
		  
		 if(((A%4)==0 &&(A%100)!=0)||(A%400)==0) {
			 System.out.println("1");
		 }else {
			 System.out.println("0");
		 }
		  
	}
}
