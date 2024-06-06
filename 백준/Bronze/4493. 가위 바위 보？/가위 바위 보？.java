import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int play = Integer.parseInt(br.readLine());
            int winPlayerA = 0;
            int winPlayerB = 0;

            for (int j = 0; j < play; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                char player1 = st.nextToken().charAt(0);
                char player2 = st.nextToken().charAt(0);

                if (player1 == 'R' && player2 == 'S'){
                    winPlayerA++;
                }else if(player1 == 'S' && player2 == 'P'){
                    winPlayerA++;
                }else if(player1 == 'P' && player2 == 'R'){
                    winPlayerA++;
                } else if (player1 == 'R' && player2 == 'P') {
                    winPlayerB++;
                }else if(player1 == 'S' && player2 == 'R'){
                    winPlayerB++;
                } else if (player1 == 'P' && player2 == 'S') {
                    winPlayerB++;
                }
            }

            if (winPlayerA > winPlayerB){
                sb.append("Player 1").append("\n");
            }else if(winPlayerA == winPlayerB){
                sb.append("TIE").append("\n");
            }else{
                sb.append("Player 2").append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
