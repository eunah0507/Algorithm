import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
    static class Frame {
        int left;
        int right;
        boolean visited;

        Frame(int left, int right, boolean visited) {
            this.left = left;
            this.right = right;
            this.visited = visited;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            if (!line.isEmpty()) {
                list.add(Integer.parseInt(line));
            }
        }

        int n = list.size();
        int[] preorder = new int[n];
        for (int i = 0; i < n; i++) {
            preorder[i] = list.get(i);
        }

        int[] nextGreater = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && preorder[stack.peek()] < preorder[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nextGreater[i] = n;
            } else {
                nextGreater[i] = stack.peek();
            }

            stack.push(i);
        }

        ArrayDeque<Frame> dfs = new ArrayDeque<>();
        dfs.push(new Frame(0, n - 1, false));

        while (!dfs.isEmpty()) {
            Frame now = dfs.pop();

            if (now.left > now.right) {
                continue;
            }

            if (now.visited) {
                sb.append(preorder[now.left]).append('\n');
                continue;
            }

            int root = now.left;
            int mid = nextGreater[root];
            if (mid > now.right) {
                mid = now.right + 1;
            }

            dfs.push(new Frame(now.left, now.right, true));
            dfs.push(new Frame(mid, now.right, false));
            dfs.push(new Frame(root + 1, mid - 1, false));
        }

        System.out.print(sb.toString());
    }
}