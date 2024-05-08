import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws IOException{
	// 평균 값을 구하는 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int answer = 0;

        for (int i = 1; i <= num; i++) {
            answer = 0;
            sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                int number = Integer.parseInt(st.nextToken());
                sum += number;
                answer = (int)Math.round(sum/10.0);
            }
            sb.append("#").append(i).append(" ").append(answer).append("\n");
        }

        System.out.println(sb.toString());
	}
}