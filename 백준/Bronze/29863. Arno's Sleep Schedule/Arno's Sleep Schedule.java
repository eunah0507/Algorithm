import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sleepTime = Integer.parseInt(br.readLine());
        int wakeTime = Integer.parseInt(br.readLine());

        int answer;
        if (sleepTime <= wakeTime) {
            answer = wakeTime - sleepTime;
        } else {
            answer = (24 - sleepTime) + wakeTime;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
