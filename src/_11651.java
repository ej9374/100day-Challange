import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11651 {

    public static void print(int[] cor){
        System.out.print(cor[0]);
        System.out.print(' ');
        System.out.print(cor[1]);
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cor[][] = new int[N][2];
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cor[i][0] = Integer.parseInt(st.nextToken());
            cor[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cor, (a,b) ->{
            if (a[1] == b[1]){
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        for (int i = 0; i < N; i++){
            print(cor[i]);
        }
    }
}
