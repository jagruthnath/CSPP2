#include <stdio.h>
#include <conio.h>
#include <string.h>
struct Student
{
	char s_name[100];
	int marks,GPA;
}s[10];
int main()
{
	int n,temp;
	char t[100];
	printf("Enter number of students :");
	scanf("%d",&n);
	for (int i = 0; i < n; ++i)
	{
		printf("Enter name, marks and GPA of Student : \n");
		scanf("%s %d %d",&s[i].s_name,&s[i].marks,&s[i].GPA);
	}
	for (int i = 0; i < n; ++i)
		for (int j = i+1; j < n; ++j)
	 		if ( s[i].GPA < s[j].GPA )
	 		{
	 			 temp=s[i].GPA;
	 			 s[i].GPA=s[j].GPA;
	 			 s[j].GPA=temp;

	 			 temp=s[i].marks;
	 			 s[i].marks=s[j].marks;
	 			 s[j].marks=temp;

	 			 strcpy(t,s[i].s_name);
	 			 strcpy(s[i].s_name,s[j].s_name);
	 			 strcpy(s[j].s_name,t);
	 		}
	for (int i = 0; i < n; ++i)
	{
		printf("%s\t%d\t%d\n",s[i].s_name,s[i].marks,s[i].GPA );
	}
}