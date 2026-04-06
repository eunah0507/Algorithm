import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static class Document implements Comparable<Document> {
        int index;
        int deadline;

        Document(int index, int deadline) {
            this.index = index;
            this.deadline = deadline;
        }

        @Override
        public int compareTo(Document other) {
            if (this.deadline != other.deadline) {
                return Integer.compare(this.deadline, other.deadline);
            }
            return Integer.compare(this.index, other.index);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Document[] documents = new Document[n];
        int[] answer = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            documents[i] = new Document(i, Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(documents);

        for (int day = 1; day <= n; day++) {
            answer[documents[day - 1].index] = day;
        }

        for (int i = 0; i < n; i++) {
            sb.append(answer[i]);
            if (i + 1 < n) {
                sb.append(' ');
            }
        }

        System.out.print(sb.toString());
    }
}