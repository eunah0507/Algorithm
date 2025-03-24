import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int currentBattery = 0;
        int lastUsed = 0;
        int connectedPhone = 0;
        int answer = 0;

        for (int i = 0; i < num; i++) {
            int nextPhone = Integer.parseInt(st.nextToken());

            if (nextPhone == connectedPhone) {
                lastUsed *= 2;
                currentBattery += lastUsed;
            } else {
                connectedPhone = nextPhone;
                lastUsed = 2;
                currentBattery += lastUsed;
            }

            if (currentBattery >= 100) {
                currentBattery = 0;
                connectedPhone = 0;
                lastUsed = 0;
            }

            answer = currentBattery;
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
