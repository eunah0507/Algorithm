import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int answer = 0;
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i <num; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp % 2 == 1){
                odd.add(tmp);
            }
            answer+=tmp;
        }

        Collections.sort(odd);

        if(answer % 2 == 1 && !odd.isEmpty()){
            answer -= odd.get(0);
        }


        sb.append(answer);
        System.out.println(sb.toString());
    }
}