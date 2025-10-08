import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) numList.add(i);
        Collections.shuffle(numList);

        int A = 0;
        for (int i = 0; i < numList.size(); i++) {
            A = numList.get(i);
            out.println("? A " + A);
            out.flush();
            int k = Integer.parseInt(br.readLine().trim());
            if (k == 1) break;
        }

        numList.clear();
        for (int i = 1; i <= 10000; i++) numList.add(i);
        Collections.shuffle(numList);

        int B = 0;
        for (int i = 0; i < numList.size(); i++) {
            B = numList.get(i);
            out.println("? B " + B);
            out.flush();
            int k = Integer.parseInt(br.readLine().trim());
            if (k == 1) break;
        }

        out.println("! " + (A + B));
        out.flush();
    }
}
