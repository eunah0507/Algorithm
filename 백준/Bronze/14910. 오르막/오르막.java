import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        // 1. while을 이용해 테스트케이스를 입력받는다.
        // 2. 다음으오 입력 받는 수가 있다면 이전에 입력받은 수와 비교한다.
        // 3. 모든 입력 받는 수가 이전 수보다 작으면 Bad 출력 아니면 Good
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String answer = "";

        List<Integer> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (true) {

            if (!st.hasMoreTokens()) {
                break;
            } else {
                arr.add(Integer.parseInt(st.nextToken()));
            }
        }

        boolean isNotMinus = true;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i-1) > arr.get(i)){
                isNotMinus = false;
            }
        }

        if (!isNotMinus){
            answer = "Bad";
        }else{
            answer = "Good";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}