
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	    // 알파벳을 숫자로 바꿔 출력하기
        // char로 받은 뒤 아스키코드화 해서 - 65하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char abc = str.charAt(i);
            int change = (int) abc - 64;

            sb.append(change).append(" ");
        }

        System.out.println(sb.toString());
	}
}