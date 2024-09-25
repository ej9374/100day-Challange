#include <stdio.h>

int main(void){
    int N;
    int i, j, k;

    scanf("%d", &N);

    for (i = 1; i <= 2 * N - 1; i++){
        if (i <= N){
            for (j = 0; i + j <= N; j++)
                printf(" ");
            for (k = 0; k < 2 * i - 1; k++)
                printf("*");
            printf("\n");
        }
        else{
            for (j = N ; j <= i ; j++)
                printf(" ");
            for (k = 0; k < 2 * (2 * N - i) - 1; k++)
                printf("*");
            printf("\n");
        }
    }
}