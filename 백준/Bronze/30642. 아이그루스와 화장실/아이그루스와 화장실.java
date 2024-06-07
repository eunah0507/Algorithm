import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // N개의 층에 홀수 층 : 큰동물, 짝수 층 : 작은 동물을 위한 화장실
        // annyong = 큼, induck = 작음
        // annyong이 홀수층에 있으면 그대로, 아니면 -1
        // induck이 홀수층에 있으면 -1, 아니면 그대로

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int floor = Integer.parseInt(br.readLine());
        String animal = br.readLine();
        int current = Integer.parseInt(br.readLine());
        int answer = 0;

        if (animal.equals("annyong") && current % 2 != 0) {
            answer = current;
        } else if (animal.equals("annyong") && current % 2 == 0) {
            if (current - 1 == 0) {
                answer = current + 1;
            } else {
                answer = current - 1;
            }
        } else if (animal.equals("induck") && current % 2 == 0) {
            answer = current;
        } else if (animal.equals("induck") && current % 2 != 0) {
            if (current - 1 == 0) {
                answer = current + 1;
            } else {
                answer = current - 1;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
