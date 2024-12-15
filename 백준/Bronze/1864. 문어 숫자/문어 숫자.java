import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        // 문어의 수 체계는 8진법에 기반한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> question = new HashMap<>();

        question.put('-', 0);
        question.put('\\', 1);
        question.put('(', 2);
        question.put('@', 3);
        question.put('?', 4);
        question.put('>', 5);
        question.put('&', 6);
        question.put('%', 7);
        question.put('/', -1);

        while (true){
            String str = br.readLine();

            if (str.equals("#")){
                break;
            }else{
                int answer = 0;
                int base = 1;

                for (int i = str.length() - 1; i >= 0; i--) {
                    char ch = str.charAt(i);
                    int value = question.get(ch);

                    answer += value * base;
                    base *= 8;
                }

                sb.append(answer).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
