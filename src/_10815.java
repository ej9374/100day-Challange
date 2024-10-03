import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10815 {

//    public static int check(int N,int card[], int num){
//        int i = 0;
//
//        while(i < N){
//            if (card[i] == num)
//                return 1;
//            i++;
//        }
//        return 0;
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int card[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            card[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        int num[] = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++)
            num[i] = Integer.parseInt(st2.nextToken());

        Arrays.sort(card);

        for (int i = 0; i < M; i++){
            bw.write(String.valueOf((Arrays.binarySearch(card, num[i]) >= 0) ? 1: 0));
            bw.write(' ');
        }
        bw.flush();
        bw.close();
    }
}
