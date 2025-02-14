import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> factorial = new HashMap<>();
        factorial.put(1, 1);
        factorial.put(2, 2);
        factorial.put(3, 6);
        factorial.put(4, 24);
        factorial.put(5, 120);

        while (true) {
            String inputData = br.readLine();

            if ("0".equals(inputData)) {
                break;
            }
            
            char[] num = inputData.toCharArray();
            int answer = 0;
            
            for (int i = 0; i < num.length; i++) {
                int calc = factorial.get((num.length - i));
                calc = calc * Integer.parseInt("" + num[i]);

                answer += calc;
            }
            
            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}