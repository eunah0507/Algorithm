import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 조건: 각 줄 마지막에는 $가 붙는다
        // 조건: 마지막 줄에는 0 하나만 온다
        // 조건: 각 줄에 중복되는 수를 없앤다.

        while (true){
            // 값들을 String으로 입력 받는다.
            String str = br.readLine();

            // 0을 입력받을 경우 종료한다.
            if (str.equals("0")){
                break;
            }else{
                // String 배열을 만들어 spilt 메서드를 이용해 쪼갠다
                String [] number = str.split(" ");
                // 배열의 크기를 지정한다.
                int count = Integer.parseInt(number[0]);
                
                int [] num = new int[count];

                for (int i = 0; i < count; i++) {
                    num[i] = Integer.parseInt(number[i + 1]);
                }
                
                // index값은 1~99 를 제외한 임의의 값을 넣는다.
                int index = -1;

                // for문을 돌려 중복이 아니면 출력한다.
                for (int i = 0; i < count; i++) {
                    if (num[i] != index){
                        sb.append(num[i]).append(" ");
                        // 다음 반복에서 현재 숫자와 비교하기 위해 i값으로 바꿔준다.
                        index = num[i];
                    }
                }

                sb.append("$").append("\n");

            }
        }

        System.out.println(sb.toString());
    }
}
