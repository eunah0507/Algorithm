package DFS_BFS_BASIC;

import java.util.LinkedList;
import java.util.Queue;

class Node_07 {
    int data;
    Node_07 lt, rt;

    public Node_07(int val) {
        data = val;
        lt = rt = null;
    }
}

public class DFS_BASIC_07 {
    Node_07 root;

    public void BFS(Node_07 root) {
        Queue<Node_07> Q = new LinkedList<>();
        Q.add(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node_07 cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) Q.add(cur.lt);
                if (cur.rt != null) Q.add(cur.rt);
            }
            L++;

            System.out.println();
        }
    }

    public static void main(String[] args) {
        DFS_BASIC_07 tree = new DFS_BASIC_07();

        tree.root = new Node_07(1);
        tree.root.lt = new Node_07(2);
        tree.root.rt = new Node_07(3);
        tree.root.lt.lt = new Node_07(4);
        tree.root.lt.rt = new Node_07(5);
        tree.root.rt.lt = new Node_07(6);
        tree.root.rt.rt = new Node_07(7);

        tree.BFS(tree.root);

    }
}
