
import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	// 2개의 수를 입력받아 크기를 비교하라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String anwswer = "";

        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());

            if (numA > numB){
                anwswer = ">";
            } else if (numA == numB) {
                anwswer = "=";
            }else{
                anwswer = "<";
            }

            sb.append("#").append(i).append(" ").append(anwswer).append("\n");
        }

        System.out.println(sb.toString());
	}
}