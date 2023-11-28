import java.util.Scanner;

public class problem_04 {
	public static void main(String[] args) {

		// 영어와 특수문자가 뒤섞인 문자열을 입력받으면, 특수문자는 그대로 두고 영어만 뒤집는 문제
		
		// 1. 테스트케이스를 문자열로 받아온다.
		// 2. 문자열을 하나씩 받아와서 넣어준다.
		// 3. 문자길이 왼쪽과 오른쪽을 만들어준다.(바꿔주기 위한)
		// 4. lt와 rt 가운데에서 만나면 빠져나오는 while문을 만들어준다.
		// 5. answer에 넣어주고 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char [] chr = str.toCharArray(); //문자열을 문자 배열로 바꿔주기 위해서.
		
		int lt = 0; //배열의 시작은 0이니까
		int rt = str.length()-1; // 문자열의 마지막부분이니까 str의 마지막숫자를 넣어준다.
		String answer = "";
		
		while(lt<rt) {
			if (!Character.isAlphabetic(chr[lt])) { //문자가 아니면 이동하겠다.
				lt++; //이동해서 만나게 하기 위해서
			}else if(!Character.isAlphabetic(chr[rt])){
				rt--;
			}else {
				char tmp = chr[lt];
				chr[lt] = chr[rt];
				chr[rt] = tmp;
				
				lt++;
				
				rt--;
			}
		}
		answer = String.valueOf(chr); //chr은 문자배열이라 STring으로 바꿔주기 위해 쓰는 것.
		
		System.out.println(answer);
		
	}
}
