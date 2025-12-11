import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        int count = 0;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            if (str.equals("ENTER")) {
                set.clear();
            } else {
                if (!set.contains(str)) {
                    count++;
                    set.add(str);
                }
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}
