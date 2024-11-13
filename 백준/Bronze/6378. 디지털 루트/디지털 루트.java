import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 무한 반복을 돌려서 숫자를 입력받는다.
        while (true){
            String str = br.readLine();

            // 0이 들어오면 종료한다.
            if (str.equals("0")){
                break;
            }else{
                // 다시 while을 돌려서 String의 길이가 1 미만이면 종료하게 한다.
                // 아닐 경우, forEach문을 통해 순회하며 sum에 더한다.
                while (str.length() > 1){
                    int sum = 0;

                    for (char ch : str.toCharArray()) {
                        sum += ch - '0';
                    }

                    str = String.valueOf(sum);
                }

                sb.append(str).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
