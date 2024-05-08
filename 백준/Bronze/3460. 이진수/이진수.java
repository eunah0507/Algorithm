import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 입력받는 수를 이진수로 나타냈을 때, 1의 위치를 모두 찾는다.
        // 13 -> 8 4 2 1 -> 1 1 0 1(2)
        // 입력값을 2로 나눈 후, 나머지가 1이면 이진수로 나타냈을 때 1이고 그 외는 0

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(br.readLine());
            int index = 0;

            // number을 소비하기 위해 while을 돌린다.
            while (number > 0){
                // number를 2로 나눴을 때 나머지가 1이면 이진수로 나타내도 1이다.
                if (number % 2 == 1){
                    // 그 때의 index(위치)를 출력한다.
                    // 최하위 숫자는 0이라고 했으니 출력 후 index++한다.
                    sb.append(index).append(" ");
                }

                // 계산이 끝나면 number를 2로 나눈다.
                // index도 증가시킨다
                number /= 2;
                index++;
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}