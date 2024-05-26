import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 초기 count는 1을 준다.
        int count = 1;

        // 계속해서 반복문을 돌리다 조건문에 맞을시 break한다.
        while(true) {
            int num = Integer.parseInt(br.readLine());
            // break 조건문
            if(num == 0){
                break;
            }

            //n의 짝수 여부
            if(num % 2 == 0) {
                num = (((num * 3) / 2) * 3) / 9;
                System.out.println(count + ". even " + num);
            }else {
                num = ((((num * 3) + 1) / 2) * 3) / 9;
                System.out.println(count + ". odd " + num);
            }
            count++;

        }

    }
}
