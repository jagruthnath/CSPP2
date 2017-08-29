#include <stdio.h>
#include<string.h>

void main()
{
	char st[11];
    printf("Enter date as dd-mm-yyyy : ");
    scanf("%s",st);
    char d[5];
    int j=0;
    for (int i=6;i<strlen(st);i++)
    {
        d[j++]=st[i];
    }
    int x=0;
    for(int i=0; i<strlen(d)-1; i++){

        x = x * 10 + ( d[i] - '0' );

    }
    printf(x);
    if (x%4==0)
        if (x%100==0)
            if (x%400==0)
                printf ("Leap year");
            else
                printf("Not a leap year");
        else
            printf ("Leap year");
    else
        printf("Not a leap year");
}