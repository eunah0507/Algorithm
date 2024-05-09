
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		 // 테스트케이스는 항상 홀수로 주어진다.
        // 모두 배열에 넣고 정렬한 뒤 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int [] arr = new int [num];
        // 배열은 0부터 시작한다.
        // 중간값은 ((num-1)/2)+1이지만, 0부터 시작하니 1을 빼준다.
        int index = ((num-1)/2);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        sb.append(arr[index]);

        System.out.println(sb.toString());
	}
}