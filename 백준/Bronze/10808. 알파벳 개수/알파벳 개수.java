import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 테스트케이스를 받고, 배열을 만든다.
        // for문을 26번(알파벳개수) 돌려서 각 자리값에 채운다.
        // forEach문으로 출력한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();

        //알파벳은 26개. 혹시 몰라서 +1해서 만든다.
        int [] abc = new int [26];

        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            int index = word - 'a';
            abc[index]++;
        }

        for (int i : abc) {
            sb.append(i + " ");
        }
        
        System.out.println(sb.toString());
    }
}
