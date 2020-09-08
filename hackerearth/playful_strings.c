#include<stdio.h>
#include<math.h>
#include<string.h>
int main()
{
	int test;
	scanf("%d",&test);
	while(test >0){
		char a[50];
		scanf("%s",a);
		int b =1;
		for(int i = 1;a[i]!='\0';i++)
		{
			if(abs((int)a[i-1]-(int)a[i]) != 1 && abs((int)a[i-1]-(int)a[i]) != 25) 
			{
				b = 0;
				break;
			}
			
		}
		if(b == 0){
			printf("NO\n");
		}
		else{
			printf("YES\n");
		}
		test -= 1;
	}
}
