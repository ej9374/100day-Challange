//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class _11123 {
//    int count = 0;
//
//    public void dfs(int x, int y){
//
//    }
//
//    public int herd(char[][] sheep, int H, int W){
//        boolean visit[][] = new boolean[H][W];
//
//        for (int i = 0; i < H; i++){
//            for (int j = 0; j < W; j++){
//                if (sheep[i][j] == '#' && !visit[i][j]){
//                    count++;
//                    visit[i][j] = true;
//                    dfs(i,j);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String[] sheep_S = new String[];
//        char[][] sheep = new char[][];
//
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        sc.nextLine();
//        int H = sc.nextInt(); //height
//        int W = sc.nextInt(); //width
//        sc.nextInt();
//        for (int i = 0; i < H; i++)
//            sheep_S[i] = sc.nextLine();
//        for (int i = 0; i < H; i++){
//            for (int j = 0; j < W; j++){
//                sheep[i][j] = sheep_S[i].charAt(j);
//            }
//        }
//    }
//
//}
