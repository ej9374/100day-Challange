import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BFS {
    int count = 0;

        public int check(int[][] com, int edge, int nodeCount){
            boolean[] visit = new boolean[nodeCount + 1];
            Queue<Integer> queue = new LinkedList<>();
            visit[1] = true;
            queue.add(1);

            while(!queue.isEmpty()){
                int current = queue.poll(); //현재 노드 상태
                for (int i = 0; i < edge; i++){
                    if (com[i][0] == current && !visit[com[i][1]]){
                        visit[com[i][1]] = true;
                        queue.add(com[i][1]);
                        count++;
                    } else if (com[i][1] == current && !visit[com[i][0]]){
                        visit[com[i][0]] = true;
                        queue.add(com[i][0]);
                        count++;
                    }
                }
            }
            return count;
        }
}

public class _2606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        sc.nextLine();
        int edge = sc.nextInt();
        sc.nextLine();

        int [][] com = new int[edge][2];
        int a, b;

        for (int i = 0; i < edge; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sc.nextLine();

            if (a < b) {
                com[i][0] = a;
                com[i][1] = b;
            } else {
                com[i][0] = b;
                com[i][1] = a;
            }
        }
        BFS bfs = new BFS();
        System.out.println(bfs.check(com, edge, node));
    }

}
