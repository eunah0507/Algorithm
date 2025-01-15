import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        // (대출일, 반납일) 구조
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int [] arr = new int[32];
        int answer = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken()) - 1;

            for (int j = start; j <= end; j++) {
                arr[j]++;
            }
        }

        int book = Integer.parseInt(br.readLine());
        
        int maxLoan = 0;

        for (int i = 1; i <= 31; i++) {
            if (arr[i] > maxLoan){
                maxLoan = arr[i];
            }
        }

        if (maxLoan <= book){
            answer = 1;
        }else{
            answer = 0;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}