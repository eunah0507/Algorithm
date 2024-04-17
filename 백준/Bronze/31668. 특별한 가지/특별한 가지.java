import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 파묻튀 한 줄에는 N 그램
        // 파묻튀밥에는 파묻튀가 M 그램
        // 파묻튀는 정확히 K 그램의 가지로 바꿔치기 해야한다.

        // 파묻튀 1줄 = 10
        // 파묻튀밥에 있는 파묻튀 200
        // 한 줄당 5그람의 가지가 필요
        // 파묻튀밥이 200그람.. 20줄 만들 수 있다. 한 줄당 5그람으로 바꿔치기 가능하므로 100그람

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int pmt = Integer.parseInt(br.readLine());
        int pmtb = Integer.parseInt(br.readLine());
        int gj = Integer.parseInt(br.readLine());

        int answer = gj * (pmtb/pmt);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}