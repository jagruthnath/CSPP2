#include <stdio.h>
#include <conio.h>
int fibon(int);
int main()
{
	int a;
	printf("Enter a number : ");
	scanf("%d",&a);
	printf("\n%d",fibon(a));
}
int fibon(int i)
{
	if (i==1 || i==0)
		return i;
	return fibon(i-1)+fibon(i-2);
}