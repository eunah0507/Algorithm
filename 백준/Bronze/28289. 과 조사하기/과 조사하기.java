import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        // 1, 2반은 소프트웨어개발과
        // 3반은 임베디드소프트웨어개발과
        // 4반은 인공지능소프웨어개발과
        // 아무런 과에도 속하지 않는 1학년
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int software = 0;
        int embedded = 0;
        int ai = 0;
        int nobody = 0;

        for (int i = 0; i < num; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());

            int grade = Integer.parseInt(st.nextToken());
            int group = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (grade == 1){
                nobody++;
            }else if (grade == 2 || grade == 3){
                if (group == 1 || group == 2){
                    software++;
                }else if (group == 3){
                    embedded++;
                }else if (group == 4){
                    ai++;
                }
            }

        }
            sb.append(software).append("\n");
            sb.append(embedded).append("\n");
            sb.append(ai).append("\n");
            sb.append(nobody).append("\n");

        System.out.println(sb.toString());
    }
}
