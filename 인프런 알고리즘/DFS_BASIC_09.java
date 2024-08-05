package DFS_BFS_BASIC;

class Node_09{
    int data;
    Node_09 lt, rt;
    public Node_09(int val) {
        data=val;
        lt=rt=null;
    }
}

public class DFS_BASIC_09 {
    Node_09 root;
    public int DFS(int L, Node_09 root){
        if(root.lt==null && root.rt==null) {
            return L;
        }else{
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }
    }

    public static void main(String[] args) {
        DFS_BASIC_09 tree=new DFS_BASIC_09();

        tree.root=new Node_09(1);
        tree.root.lt=new Node_09(2);
        tree.root.rt=new Node_09(3);
        tree.root.lt.lt=new Node_09(4);
        tree.root.lt.rt=new Node_09(5);

        System.out.println(tree.DFS(0, tree.root));
    }
}
