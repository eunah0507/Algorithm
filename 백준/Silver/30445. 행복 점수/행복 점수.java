import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String message = br.readLine();
        HashSet<Character> happySet = new HashSet<>();
        HashSet<Character> sadSet = new HashSet<>();

        for (char c : "HAPPY".toCharArray()) {
            happySet.add(c);
        }
        for (char c : "SAD".toCharArray()) {
            sadSet.add(c);
        }

        int happy = 0;
        int sad = 0;

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') continue;
            if (happySet.contains(c)) happy++;
            if (sadSet.contains(c)) sad++;
        }

        double H;
        if (happy == 0 && sad == 0) {
            H = 0.5;
        } else {
            H = (double) happy / (happy + sad);
        }

        sb.append(String.format("%.2f", H * 100));
        System.out.println(sb.toString());
    }
}
