import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Student {
        int country;
        int number;
        int score;

        Student(int country, int number, int score) {
            this.country = country;
            this.number = number;
            this.score = score;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int c = Integer.parseInt(split[0]);
            int s = Integer.parseInt(split[1]);
            int score = Integer.parseInt(split[2]);
            list.add(new Student(c, s, score));
        }

        list.sort((a, b) -> b.score - a.score);

        Map<Integer, Integer> medalCount = new HashMap<>();
        int awarded = 0;

        for (Student stu : list) {
            int count = medalCount.getOrDefault(stu.country, 0);
            if (count >= 2) continue;

            sb.append(stu.country).append(" ").append(stu.number).append("\n");
            medalCount.put(stu.country, count + 1);
            awarded++;

            if (awarded == 3) break;
        }

        System.out.print(sb.toString());
    }
}
