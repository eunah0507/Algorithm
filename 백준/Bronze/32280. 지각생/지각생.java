import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        ArrayList<String> student = new ArrayList<>();
        String teacher = "";

        for (int i = 0; i < (num + 1); i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String time = st.nextToken();
            String part = st.nextToken();

            if (part.equals("teacher")){
                teacher = time;
            }else{
                student.add(time);
            }
        }

        String late = br.readLine();
        String [] lateTime = late.split(":");
        String [] teacherTime = teacher.split(":");
        int totalLateHour = 0;
        int totalLateMinutes = 0;

        if (Integer.parseInt(teacherTime[0]) > Integer.parseInt(lateTime[0])){
            totalLateHour = Integer.parseInt(teacherTime[0]);
            totalLateMinutes = Integer.parseInt(teacherTime[1]);
        }else if (Integer.parseInt(teacherTime[0]) == Integer.parseInt(lateTime[0])){
            totalLateHour = Integer.parseInt(lateTime[0]);

            if (Integer.parseInt(teacherTime[1]) >= Integer.parseInt(lateTime[1])){
                totalLateMinutes = Integer.parseInt(teacherTime[1]);
            }else{
                totalLateMinutes = Integer.parseInt(lateTime[1]);
            }
        }else{
            totalLateHour = Integer.parseInt(lateTime[0]);
            totalLateMinutes = Integer.parseInt(lateTime[1]);
        }

        for (int i = 0; i < num; i++) {
            String tmp = student.get(i);

            String [] arr = tmp.split(":");
            int hour = Integer.parseInt(arr[0]);
            int minutes = Integer.parseInt(arr[1]);

            if (totalLateHour < hour){
                answer++;
            }else if (totalLateHour == hour){
                if (totalLateMinutes <= minutes){
                    answer++;
                }else {
                    continue;
                }
            }else{
                continue;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}