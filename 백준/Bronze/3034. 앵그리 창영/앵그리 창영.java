import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 박스의 크기와 성냥의 길이가 주어졌을 때, 박스에 들어갈 수 있는지?
        // 성냥의 길이가 박스의 가로, 세로 보다 작거나 같아야한다.
        // 대각선의 길이보다도 작거나 같아야한다.
        // 가로,세로 = 입력 값 , 대각선의 길이 = 가로제곱 + 세로 제곱의 루트

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int matches = Integer.parseInt(st.nextToken());
        int boxGaro = Integer.parseInt(st.nextToken());
        int boxSero = Integer.parseInt(st.nextToken());
        String answer = "";

        for (int i = 0; i < matches; i++) {
            int howLong = Integer.parseInt(br.readLine());

            if (howLong <= boxGaro){
                sb.append("DA").append("\n");
            }else if(howLong <= boxSero){
                sb.append("DA").append("\n");
            }else if(howLong <= Math.sqrt(Math.pow(boxGaro, 2) + Math.pow(boxSero, 2))){
                sb.append("DA").append("\n");
            }else{
                sb.append("NE").append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
