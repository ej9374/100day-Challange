import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1181 {
    public static void main(String[] args) throws IOException {
        String temp = new String();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }
        for (int i = 0; i < N; i++){
            for(int j = 0; j < N - i - 1; j++){
                if(str[j].length() > str[j + 1].length()){
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                } else if (str[j].length() == str[j + 1].length()){
                    if (str[j].compareTo(str[j + 1]) > 0) {
                        temp = str[j];
                        str[j] = str[j + 1];
                        str[j + 1] = temp;
                    }
                }
            }
        }

        int change = N;
        for (int i = 0; i < change - 1; i++) {
            if (str[i].equals(str[i + 1])) {
                for (int k = i + 1; k < change - 1; k++) {
                    str[k] = str[k + 1];
                }
                change--;
                i--;
            }

        }
        for (int i = 0; i < change; i++) {
            System.out.println(str[i]);
        }
    }

}
