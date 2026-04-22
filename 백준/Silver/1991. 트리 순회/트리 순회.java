import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] tree;
    static StringBuilder sbPre = new StringBuilder();
    static StringBuilder sbIn = new StringBuilder();
    static StringBuilder sbPost = new StringBuilder();

    static void preorder(int now) {
        if (now == -1) {
            return;
        }

        sbPre.append((char) (now + 'A'));
        preorder(tree[now][0]);
        preorder(tree[now][1]);
    }

    static void inorder(int now) {
        if (now == -1) {
            return;
        }

        inorder(tree[now][0]);
        sbIn.append((char) (now + 'A'));
        inorder(tree[now][1]);
    }

    static void postorder(int now) {
        if (now == -1) {
            return;
        }

        postorder(tree[now][0]);
        postorder(tree[now][1]);
        sbPost.append((char) (now + 'A'));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        tree = new int[26][2];

        for (int i = 0; i < 26; i++) {
            tree[i][0] = -1;
            tree[i][1] = -1;
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = st.nextToken().charAt(0) - 'A';
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            if (left != '.') {
                tree[parent][0] = left - 'A';
            }

            if (right != '.') {
                tree[parent][1] = right - 'A';
            }
        }

        preorder(0);
        inorder(0);
        postorder(0);

        sb.append(sbPre).append('\n');
        sb.append(sbIn).append('\n');
        sb.append(sbPost);

        System.out.print(sb.toString());
    }
}