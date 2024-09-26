import java.util.Scanner;

class Word {
    char[] arr;
    char[] alp = new char[27];
    int j = 0;

    //생성자
    Word(String str){
        this.arr = str.toCharArray();
    }

    public int check() {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i + 1] != arr[i]) {
                for (int k = 0; k < j; k++) {
                    if (arr[i] == alp[k]) {
                        return 0;
                    }
                }
                alp[j] = arr[i];
                j++;
            }
            if (i == arr.length - 1){
                int k = 0;
                while(k < j){
                    if (arr[i] == alp[k])
                        return 0;
                    k++;
                }
            }
        }
        return 1;
    }
}

public class _1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int N = sc.nextInt();
        sc.nextLine();
        for (int a = 0; a < N; a++){
            String str = sc.nextLine();
            Word word = new Word(str);
            if (word.check() != 0)
                count++;
        }
        System.out.println(count);
    }
}
