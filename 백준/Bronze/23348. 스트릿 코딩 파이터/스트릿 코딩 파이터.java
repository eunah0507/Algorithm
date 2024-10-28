import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int GradeA = Integer.parseInt(st.nextToken());
        int GradeB = Integer.parseInt(st.nextToken());
        int GradeC = Integer.parseInt(st.nextToken());
        int clubNum = Integer.parseInt(br.readLine());

        int maxGrade = 0;
        for (int i = 0; i < clubNum; i++) {
            
            int clubGrade = 0;
            for (int j = 0; j < 3; j++) {
                
                st = new StringTokenizer(br.readLine());
                clubGrade = clubGrade
                        + Integer.parseInt(st.nextToken()) * GradeA
                        + Integer.parseInt(st.nextToken()) * GradeB
                        + Integer.parseInt(st.nextToken()) * GradeC;
            }
            maxGrade = Math.max(clubGrade, maxGrade);
        }

        sb.append(maxGrade);
        System.out.println(sb.toString());
    }
}
