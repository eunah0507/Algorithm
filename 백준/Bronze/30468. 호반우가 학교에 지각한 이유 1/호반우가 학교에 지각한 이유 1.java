import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 이세계로 가버린 반우.. 그냥 그 세계에 사는건 어떨지..?
        // 이세계 용사로 취뽀한 반우는 풍족한 생활을 뒤로 하고
        // 굳~이 돌아오겠다고 하니 도와주자

        // (요구하는 평균 - 현재 평균) * 4(스탯 4가지니까)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int STR = Integer.parseInt(st.nextToken());
        int DEX = Integer.parseInt(st.nextToken());
        int INT = Integer.parseInt(st.nextToken());
        int LUK = Integer.parseInt(st.nextToken());
        int avg = Integer.parseInt(st.nextToken());

        // 현재의 평균을 구한다.
        int current = (STR + DEX + INT + LUK);

        // 축복해야할 횟수를 구한다.
        // 스탯이 4가지이므로 요구스택 * 4 한다.
        int answer = (avg * 4 - current);

        // 현재 평균이 요구하는 수보다 크거나 같을 경우, 답을 0으로 고정한다
        if (current >= avg * 4){
            answer = 0;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}