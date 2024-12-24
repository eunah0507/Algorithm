import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        String rainbowLower = "roygbiv";
        String rainbowUpper = "ROYGBIV";
        
        boolean[] lowerCheck = new boolean[26];
        boolean[] upperCheck = new boolean[26]; 

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowerCheck[ch - 'a'] = true;
            } else if (Character.isUpperCase(ch)) {
                upperCheck[ch - 'A'] = true;
            }
        }

        boolean lowerRainbow = true;
        boolean upperRainbow = true;

        for (char ch : rainbowLower.toCharArray()) {
            if (!lowerCheck[ch - 'a']) {
                lowerRainbow = false;
                break;
            }
        }

        for (char ch : rainbowUpper.toCharArray()) {
            if (!upperCheck[ch - 'A']) {
                upperRainbow = false;
                break;
            }
        }

        if (lowerRainbow && upperRainbow) {
            System.out.println("YeS");
        } else if (lowerRainbow) {
            System.out.println("yes");
        } else if (upperRainbow) {
            System.out.println("YES");
        } else {
            System.out.println("NO!");
        }
    }
}
