
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		 // 10개의 수를 입력받아, 그 중 홀수만 더하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum = 0;

            for (int j = 0; j < 10; j++) {
                int number = Integer.parseInt(st.nextToken());

                if (number % 2 == 1){
                    sum += number;
                }
            }

            sb.append("#").append(i+1).append(" ").append(sum).append("\n");
        }

        System.out.println(sb.toString());
        
		
	}
}