import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 상근이는 45분 일찍 알람을 설정한다.
		// 해당하는 시간보다 45분 빠르게 출력되도록 한다.
		
		// 1. 두 수를 받는다.
		// 2. 두번째 수에서 45분을 뺀다. 60분 기준으로 한다.
		// 3. 두번째 수가 45보다 작을 경우, 첫번째 수에서 1을 뺀다.
		// 4. 출력한다
		
		  Scanner sc = new Scanner(System.in);
		  
		  int A = sc.nextInt();
		 
		  int B = sc.nextInt();
		  
		  int hour = 0;
		  int minutes =0;
		  
		  if (B>=45 && A>0) {
			minutes = B-45;
			hour = A;
		}else if(B<45 && A>0) {
			hour = A-1;
			minutes = 60+B-45;
		// B-45<0 45-B값만큼 빼고, 
		// A에서 1을 빼고, B에는 차이값을 0에서 더해준다.
		}else if(B>=45 && A==0) {
			minutes = B-45;
			hour = A;
		}else if(B<45 && A==0) {
			minutes = 60+B-45;
		  	hour = A+23;
		}  
		  System.out.print(hour);
		  System.out.println(" "+minutes);
	}
}
