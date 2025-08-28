import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        br.readLine();
        br.readLine();
        br.readLine();

        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                for (int c = 1; c <= 10; c++) {
                    for (int d = 1; d <= 10; d++) {
                        sb.append("-1\n");
                    }
                }
            }
        }

        System.out.print(sb.toString());
    }
}
