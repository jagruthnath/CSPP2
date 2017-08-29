#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int i=1;
    do {
        if (n%i==0)
            printf("%d\n",i);
    }while (i++<=n/2);
    printf("%d",n);
    return 0;
}