import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. 단어의 앞글자를 따서 만들어야한다.
        // 2. 'i', 'pa', 'te', 'ni', 'niti', 'a', 'ali', 'nego', 'no', 'ili'. 무시한다.
        // 3. 2번의 단어들이 맨 앞에 있으면 무시X

        // 1, spilt을 이용하여 배열에 가둔다.
        // 2. 단 arr[0]이 2번일 경우에는 포함한다.
        // 3. 2번일 경우 무시한다.
        // 4. 각 배열의 순서에 맨 앞 글자를 answer에 더한다.

        String str = br.readLine();
        String[] arr = str.split(" ");
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);

            if (i == 0) {
                answer += ch;
            }else {
                if (arr[i].equals("i") || arr[i].equals("pa") || arr[i].equals("te") ||
                        arr[i].equals("ni") || arr[i].equals("niti") || arr[i].equals("a") ||
                        arr[i].equals("ali") || arr[i].equals("nego") || arr[i].equals("no") ||
                        arr[i].equals("ili")){
                    continue;
                }else{
                    answer += ch;
                }
            }
        }

        answer = answer.toUpperCase();

        sb.append(answer);
        System.out.println(sb.toString());
    }
}

