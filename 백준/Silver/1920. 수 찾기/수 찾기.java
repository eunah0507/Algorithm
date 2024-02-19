import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new LinkedHashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        int[] Marr = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            Marr[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = new int[M];
        for (int i = 0; i < M; i++) {
           if (set.contains(Marr[i])){
               answer[i] = 1;
           }else{
               answer[i] = 0;
           }
        }
        
        for (int i : answer) {
            sb.append(i).append("\n");
        }

        System.out.println(sb.toString());

    }
}