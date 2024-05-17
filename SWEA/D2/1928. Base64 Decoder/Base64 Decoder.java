
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
         //??????????

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            String str = br.readLine();
            String answer = new String(Base64.getDecoder().decode(str));

            sb.append("#").append(i).append(" ").append(answer).append("\n");
        }

        System.out.println(sb.toString());
	}
}