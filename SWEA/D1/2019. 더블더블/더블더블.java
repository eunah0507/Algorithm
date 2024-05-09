
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        // 주어진 횟수만큼 *2 한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 1;

        for (int i = 0; i < num+1; i++) {
            sb.append(answer).append(" ");

            answer *= 2;
        }

        System.out.println(sb.toString());
	}
}