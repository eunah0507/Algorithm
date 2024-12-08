import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[][] map = new long[N][M];
        char[][] img = new char[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                long r = Integer.parseInt(st.nextToken());
                long g = Integer.parseInt(st.nextToken());
                long b = Integer.parseInt(st.nextToken());
                map[i][j] = 2126*r+7152*g+722*b;

                if(map[i][j] >=2040000){
                    img[i][j] = '.';
                }else if(map[i][j] >= 1530000){
                    img[i][j] = '-';
                }else if(map[i][j] >=1020000){
                    img[i][j] = '+';
                }else if(map[i][j] >=510000){
                    img[i][j] = 'o';
                }else if(map[i][j] >=0){
                    img[i][j] = '#';
                }

                sb.append(img[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());

    }
}
