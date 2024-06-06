import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 무한 반복을 돌린다.
        while (true) {
            // 두 값을 받는다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            String numA = st.nextToken();
            String numB = st.nextToken();

            // 받아올림이 되면 count++한다.
            int count = 0;
            // 만약 받아올려지게 된다면, 같이 더해줄 수를 구해둔다.
            int isSumTen = 0;

            if (numA.equals("0") && numB.equals("0")) {
                break;
            } else {
                // A와 B를 뒤집는다.
                // 두 수가 자릿수가 다를 수 있으므로 뒤집어서 계산한다.
                StringBuffer buffer = new StringBuffer(numA);
                String reverseNumA = buffer.reverse().toString();

                buffer = new StringBuffer(numB);
                String reverseNumB = buffer.reverse().toString();

                // 두 수 중, 자릿수가 더 짧은 수만 더하면 된다.
                int minLength = (int) Math.min(numA.length(), numB.length());
                int maxLength = (int) Math.max(numA.length(), numB.length());

                // 이제 for문을 돌려서 각 자리끼리 더한다.
                for (int i = 0; i < minLength; i++) {
                    // char로 뽑는다
                    char wordA = reverseNumA.charAt(i);
                    char wordB = reverseNumB.charAt(i);

                    // 뽑은 char를 int로 변환한다.
                    int changeWordA = Integer.parseInt(String.valueOf(wordA));
                    int changeWordB = Integer.parseInt(String.valueOf(wordB));

                    // 이전 자릿수에서 10을 넘었을 때와 A,B를 더해서 10이 넘으면 count한다.
                    // 다음 자릿수 계산을 위해 isSumTen을 1로 변경한다(10이 넘었을 때만)
                    if (isSumTen + changeWordA + changeWordB >= 10) {
                        count++;
                        isSumTen = 1;
                    }else{
                        isSumTen = 0;
                    }
                }
                
                // 남은 자릿수가 받아올려지는 수와 더해졌을 때 10을 넘을 경우를 대비한다.
                String reverseNum;
                
                // reverseNum에 어떤 수가 들어갈지 미리 if문을 돌려 구한다.
                if (reverseNumA.length() >= reverseNumB.length()){
                    reverseNum = reverseNumA;
                }else{
                    reverseNum = reverseNumB;
                }

                // 다시 for문을 돌리되, minLength부터 돌린다.
                for (int i = minLength; i < maxLength; i++) {
                    // char로 뽑는다
                    char word = reverseNum.charAt(i);

                    // 뽑은 char를 int로 변환한다.
                    int changeWord = Integer.parseInt(String.valueOf(word));
                    
                    if (isSumTen + changeWord >= 10) {
                        count++;
                        isSumTen = 1;
                    }else{
                        isSumTen = 0;
                    }
                }
                
                
                sb.append(count).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
