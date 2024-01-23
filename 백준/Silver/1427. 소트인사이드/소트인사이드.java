import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 주어진 수 뒤집기

        // 1. BufferedReader로 값을 받아온다.
        // 2. 배열을 만든다. (여기서부터 질문)
        // 3. 받아온 값을 1,10,100 등 단위로 쪼개서 값을 각각 넣는다.
        // 4. 내림차순 정렬한다.
        // 5. 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long num = Long.parseLong(br.readLine());
        int index = 1;
        long number = num;

        while (true) {
            if (num < 10) {
                break;
            }

            num /= 10;
            index++;
        }


        Long [] arr = new Long[index];

        for (int i = 0; i < index; i++) {
            arr[i] = (number % 10);
            number /= 10;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (long i : arr){
            sb.append(i);
        }

        System.out.println(sb.toString());
    }
}