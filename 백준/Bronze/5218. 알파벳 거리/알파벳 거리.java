import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i <num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String strA = st.nextToken();
            String strB = st.nextToken();

            int [] arr = new int[strA.length()];

            for (int j = 0; j < strA.length(); j++) {
                if (strB.charAt(j) >= strA.charAt(j)){
                    arr[j] = strB.charAt(j) - strA.charAt(j);
                }else{
                    arr[j] = strB.charAt(j) - strA.charAt(j) + 26;
                }
            }

            sb.append("Distances: ");

            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[j]).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}