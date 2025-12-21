import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }

            if (line.equals("# 0")) {
                break;
            }

            String[] first = line.split(" ");
            String flight = first[0];
            int booked = Integer.parseInt(first[1]);

            while (true) {
                String t = br.readLine();
                String[] parts = t.split(" ");

                if (parts[0].equals("X")) {
                    break;
                }

                if (parts[0].equals("B")) {
                    int n = Integer.parseInt(parts[1]);
                    if (booked + n <= 68) {
                        booked += n;
                    }
                } else if (parts[0].equals("C")) {
                    int n = Integer.parseInt(parts[1]);
                    if (n <= booked) {
                        booked -= n;
                    }
                }
            }

            sb.append(flight).append(" ").append(booked).append('\n');
        }

        System.out.print(sb);
    }
}
