import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String[] question = new String[4];
        int[] grade = new int[4];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            question[i] = st.nextToken();
            grade[i] = Integer.parseInt(st.nextToken());

            min = Math.min(grade[i], min);
        }

        for (int i = 0; i < num; i++) {
            if (grade[i] == min){
                sb.append(question[i]);
            }else{
                continue;
            }
        }

        System.out.println(sb.toString());
    }
}
