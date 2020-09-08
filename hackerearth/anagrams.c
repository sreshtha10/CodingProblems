#include<stdio.h>
#include<math.h>
int main()
{
	int test;
	scanf("%d",&test);
	while(test >0)
	{
		char a[10000],b[10000];
		scanf("%s %s",a,b);
		int fa[26] = {0},fb[26] = {0},count = 0;
		for(int i = 0;a[i] != '\0';i++)
		{
			fa[(int)a[i]-97] += 1;
		}
		for(int i = 0;b[i] != '\0';i++)
		{
			fb[(int)b[i]-97] += 1;
		}
		for (int i = 0;i<26;i++)
		{
			count += abs(fa[i]-fb[i]);
		}
		printf("%d\n",count);
		test -= 1;
	}
}
