#include <stdio.h>
#include <conio.h>
#include <string.h>
int main()
{
	char k[12]="convergence";
	int count=0,ct[12];
	char ch;
	for (int i = 0; k[i]!='\0'; ++i)
		ct[i]=0;
	for (int i = 0; k[i]!='\0'; ++i)
	{
		count=0;
		for (int j = 0; k[j]!='\0'; ++j)
			if (k[i]==k[j])
				count++;
		if (ct[i]==0)
			ct[i]=count;
	}
	for (int i = 0; k[i]!='\0'; ++i)
	{
		printf("%c\t%d\n",k[i],ct[i]);
	}
}