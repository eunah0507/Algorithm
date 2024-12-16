import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        // 23으로만 이뤄진 수의 합 순서 구하기
        // 1. 23의 배수
        // 2. 2323 등 23의 반복
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int answer = 0;

            int index = Integer.parseInt(br.readLine());
            answer = 23 * index;
//            String str = "23";
//            str = str.repeat(index);
//
//            if (index > Integer.parseInt(str)){
//                answer = Integer.parseInt(str);
//            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}
