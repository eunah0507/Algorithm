
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws IOException
	{
        // 홀수는 더하고 짝수는 더했을 때의 결과

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int score = 0;

        for (int i = 1; i <= num; i++) {
            int number = Integer.parseInt(br.readLine());

            score = 1;

            for (int j = 2; j <= number; j++) {
                if (j % 2 == 0){
                    score -= j;
                }else{
                    score += j;
                }
            }
            sb.append("#").append(i).append(" ").append(score).append("\n");
        }
        System.out.println(sb.toString());
	}
}