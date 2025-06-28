import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        StringBuilder rx = new StringBuilder();
        StringBuilder ry = new StringBuilder();
        for (int i = 0; i < x; i++) rx.append('1');
        for (int i = 0; i < y; i++) ry.append('1');

        int sum = Integer.parseInt(rx.toString()) + Integer.parseInt(ry.toString());
        sb.append(sum);

        System.out.println(sb.toString());
    }
}
