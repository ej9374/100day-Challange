#include <stdio.h>

int main(void){
    int N, n, copy;
    int count = 0;
    int a, b;

    scanf("%d", &N);

    copy = N;

    while(1){
        count++;
        a = N / 10; //10의자리
        b = N % 10; //1의자리
        n = b * 10 + (a + b) % 10;
        if (n == copy)
            break;
        N = n;
    }
    printf("%d", count);
}