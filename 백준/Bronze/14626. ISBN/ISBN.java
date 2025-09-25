import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();

        StringBuilder sb = new StringBuilder();
        int starIndex = -1;
        int sum = 0;

        for (int i = 0; i < 12; i++) { 
            char ch = isbn.charAt(i);
            if (ch == '*') {
                starIndex = i;
                continue;
            }
            int num = ch - '0';
            if (i % 2 == 0) sum += num;      
            else sum += num * 3;            
        }

        int check = isbn.charAt(12) - '0';
        int answer = -1;

        for (int d = 0; d <= 9; d++) {
            int temp = sum;
            if (starIndex % 2 == 0) temp += d;
            else temp += d * 3;
            if ((temp + check) % 10 == 0) {
                answer = d;
                break;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
