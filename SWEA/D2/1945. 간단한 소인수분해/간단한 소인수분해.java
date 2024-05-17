
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{// N=2a x 3b x 5c x 7d x 11e

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            int number = Integer.parseInt(br.readLine());
            int countTwo = 0;
            int countThree = 0;
            int countFive = 0;
            int countSeven = 0;
            int countEleven = 0;

            while (number > 1) {
                if (number % 2 == 0) {
                    number /= 2;
                    countTwo++;
                }else if (number % 3 == 0) {
                    number /= 3;
                    countThree++;
                } else if (number % 5 == 0) {
                    number /= 5;
                    countFive++;
                } else if (number % 7 == 0) {
                    number /= 7;
                    countSeven++;
                } else if (number % 11 == 0) {
                    number /= 11;
                    countEleven++;
                }else{
                    break;
                }
            }
            sb.append("#").append(i).append(" ").append(countTwo).append(" ").append(countThree).append(" ").append(countFive).append(" ").append(countSeven).append(" ").append(countEleven).append("\n");
        }
            System.out.println(sb.toString());
	}
}