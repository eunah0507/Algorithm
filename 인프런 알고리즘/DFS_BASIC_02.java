package DFS_BFS_BASIC;

class DFS_BASIC_02 {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public void solution(int n){
        DFS(n);
    }
    public static void main(String[] args){
        DFS_BASIC_02 T = new DFS_BASIC_02();
        T.solution(11);
        //System.out.println(T.solution(3));
    }
}
