import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 오븐 타이머 문제
		// 현재 시간에서 입력받은 시간 후의 시간을 계산하라
		
		// 1. 세 수를 받는다.
		// 2. 두번째 수와 세번째 수를 더한다. -> 60분 기준으로 한다.
		// 3. 60이 넘어가면 첫번째 수를 (값/60)을 더한다.
		// 4. 출력한다
		
		  Scanner sc = new Scanner(System.in);
		  
		  int A = sc.nextInt();
		 
		  int B = sc.nextInt();
		  
		  int C = sc.nextInt();
		  
		  int hour = 0;
		  int minutes =0;
		  
		  minutes = (B+C)%60;
		  
		  if ((B+C)>=60) {
			hour = A+(B+C)/60;
		}else if((B+C)<60) {
			hour = A;
		}
		 // 이 때, A가 23을 넘어갈 경우를 입력한다.
		  
		  if(hour<=23) {

		  }else if(hour>23) {
			  hour = hour%24;
		  }
		  
		  System.out.print(hour);
		  System.out.println(" " + minutes);
        
	}
}
