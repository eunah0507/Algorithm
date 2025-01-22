import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String bitString = br.readLine();
            int numByOne = 0;
            char lastCharacter = ' ';
            char oneOrZero = '0';

            if("#".equals(bitString)){
                break;
            }

            for (int i = 0; i < bitString.length(); i++) {
                if(i == bitString.length() -1){
                    lastCharacter = bitString.charAt(i);
                }else{
                    if(bitString.charAt(i) == '1'){
                        numByOne++;
                    }
                }
            }

            if(lastCharacter == 'e'){
                oneOrZero = numByOne % 2 == 0 ? '0' : '1';
            } else if (lastCharacter == 'o') {
                oneOrZero = numByOne % 2 == 0 ? '1' : '0';
            }

            sb.append(bitString, 0, bitString.length() - 1)
                    .append(oneOrZero)
                    .append("\n");
        }

        System.out.println(sb.toString());

    }
}