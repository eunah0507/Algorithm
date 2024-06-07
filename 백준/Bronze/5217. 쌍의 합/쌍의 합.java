import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 1보다 크고 12보다 작은 자연수 n이 주어지면, 합이 n이 되는 두 자연수 쌍을 찾아라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(br.readLine());
            // 쉼표 찍기 위한 것
            int count = 0;

            // 다시 for문을 1부터 number만큼 돌린다.
            // number - j가 몇인지 j와 함께 출력한다.
            // 겹치지 않게 한다.
            sb.append("Pairs for ").append(number).append(": ");
            for (int j = 1; j <= number; j++) {
                for (int k = j+1; k <= number; k++) {
                    if (j + k == number){
                        // 한 숫자가 두 쌍 이상 나올 때 ","를 찍는다
                       if (count >= 1){
                           sb.append(", ");
                       }
                       sb.append(j).append(" ").append(k);
                       count++;
                    }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
