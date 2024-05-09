
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		  // 8자리 숫자가 주어진다.
        // 유효한 날짜면 YYYY/MM/DD 형식으로 출력
        // 유효하지 않으면 -1 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int second,third;

        for (int i = 0; i < num; i++) {
            String year = "";
            String month = "";
            String day = "";
            second = 0;
            third = 0;

            String d = br.readLine();

            for (int j = 0; j < 4; j++) {
                char y = d.charAt(j);
                year += y;
            }

            for (int j = 0; j < 2; j++) {
                char m = d.charAt(j + 4);
                month += m;
            }

            for (int j = 0; j < 2; j++) {
                char dd = d.charAt(j + 6);
                day += dd;
            }

            second = Integer.parseInt(month);
            third = Integer.parseInt(day);

            if (second <= 0 || second >= 13){
                sb.append("#").append(i+1).append(" ").append("-1").append("\n");
            }else if((second == 1 || second == 3 || second == 5 || second == 7 || second == 8 || second == 10 || second == 12) && third > 31){
                sb.append("#").append(i+1).append(" ").append("-1").append("\n");
            }else if(second == 2 && third > 28){
                sb.append("#").append(i+1).append(" ").append("-1").append("\n");
            }else if((second == 4 || second == 6 || second == 9 || second == 11) && third > 30){
                sb.append("#").append(i+1).append(" ").append("-1").append("\n");
            }else{
                sb.append("#").append(i+1).append(" ").append(year).append("/").append(month).append("/").append(day).append("\n");
            }

        }

        System.out.println(sb.toString());
	}
}