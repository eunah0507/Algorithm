
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{ // 호석아 제발 자라!!

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            String str = br.readLine();
            int number = Integer.parseInt(str);

            // 0부터 9까지 모든 숫자를 봤는지 확인할 배열을 만든다.
            boolean [] count = new boolean[10];
            // 몇 번 셌는지 확인하기 위한 변수
            int answer = 0;
            // number를 곱해줄 변수
            int mul = 1;

            while (true){
                for (int j = 0; j < str.length(); j++) {
                    // 한 글자씩 정수로 변환해 확인한다.
                    int tmp = Integer.parseInt(str.substring(j, j+1));

                    if (count[tmp] == false){
                        answer++;
                        count[tmp] = true;
                    }
                }

                if (answer == 10){
                    break;
                }
                mul++;
                str = Integer.toString(number * mul);
            }

            sb.append("#").append(i).append(" ").append(str).append("\n");
        }

        System.out.println(sb.toString());
	}
}