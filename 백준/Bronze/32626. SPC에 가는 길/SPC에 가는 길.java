import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int sx = Integer.parseInt(st.nextToken());
		int sy = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int ex = Integer.parseInt(st.nextToken());
		int ey = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int px = Integer.parseInt(st.nextToken());
		int py = Integer.parseInt(st.nextToken());

		if (sx == ex || sy == ey) {
			if ((sx == ex && px == sx && between(py, sy, ey)) ||
				(sy == ey && py == sy && between(px, sx, ex))) {
				sb.append(2); 
			} else {
				sb.append(0);
			}
		} else {
			boolean blocked1 = (py == sy && px == ex && between(sx, px, ex));
			boolean blocked2 = (px == sx && py == ey && between(sy, py, ey));
			if ((py == sy && between(px, sx, ex) && px == ex) ||
				(px == sx && between(py, sy, ey) && py == ey) ||
				(py == ey && between(px, ex, sx) && px == sx) ||
				(px == ex && between(py, ey, sy) && py == sy)) {
				sb.append(2); 
			} else {
				sb.append(1); 
			}
		}

		System.out.println(sb.toString());
	}

	private static boolean between(int val, int a, int b) {
		return (val > Math.min(a, b) && val < Math.max(a, b));
	}
}
