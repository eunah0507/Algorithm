import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][num];
        int answer = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < num; i++) {

            for (int j = 0; j <= i; j++) {
                if(j==0){
                    arr[i][j] += arr[i-1][j];
                }
                else {
                    arr[i][j] = Math.max(arr[i][j] + arr[i-1][j-1], arr[i][j] + arr[i-1][j]);
                }
            }
        }

        for (int i = 0; i < num; i++) {
            answer = Math.max(answer, arr[num-1][i]);
        }
        System.out.println(answer);


    }
}
