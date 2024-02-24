package Sorting_and_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Sorting_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int [] arr = new int [num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> answer = new ArrayList<>();

        // 깊은 복사
        int [] tmp = arr.clone();

        Arrays.sort(tmp);

        for (int i = 0; i < num; i++) {
            if (arr[i] != tmp[i]){
                answer.add(i+1);
            }
        }

        for (Integer integer : answer) {
            sb.append(integer).append(" ");
        }

        System.out.println(sb.toString());
    }
}
