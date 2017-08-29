#include <stdio.h>
#include<string.h>

void main()
{
    char s[100];
    printf("Enter input:");
    scanf("%s",s);
    for (int i=1;i<strlen(s)-1;i++)
    {
        printf("%c",s[i]);
    }
    printf("\n");
}