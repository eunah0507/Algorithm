import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int maxCount = 0;
        int lastStudent = 0;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int student = Integer.parseInt(st.nextToken());
                queue.addLast(student);
                int size = queue.size();

                if (size > maxCount) {
                    maxCount = size;
                    lastStudent = student;
                } else if (size == maxCount && student < lastStudent) {
                    lastStudent = student;
                }

            } else if (type == 2) {
                queue.pollFirst();
            }
        }

        sb.append(maxCount).append(' ').append(lastStudent);
        System.out.println(sb.toString());
    }
}
