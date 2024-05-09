
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		   // 주어진 숫자부터 0까지 차례대로 찍기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        while (num >= 0){
            sb.append(num).append(" ");
            num--;
        }

        System.out.println(sb.toString());
	}
}