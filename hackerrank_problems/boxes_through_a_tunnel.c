//Method 1:
#include <stdio.h>
#include <stdlib.h>
#define MAX_HEIGHT 41

struct box
{
	int length;
    int height;
    int width;
};

typedef struct box box;

int get_volume(box b) {
	return b.length*b.height*b.width;
}

int is_lower_than_max_height(box b) 
{
	if(b.height < MAX_HEIGHT)
    {
        return 1;
    }
    else {
    return 0;
    }   
}

int main()
{
	int n;
	scanf("%d", &n);
	box *boxes = malloc(n * sizeof(box));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &boxes[i].length, &boxes[i].width, &boxes[i].height);
	}
	for (int i = 0; i < n; i++) {
		if (is_lower_than_max_height(boxes[i])) {
			printf("%d\n", get_volume(boxes[i]));
		}
	}
	return 0;
}

//Method 2:
/*#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n][3];
    for (int i = 0;i <n;i++) 
    {
        for(int j = 0;j<3;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    
    for(int i = 0;i<n;i++)
    {
        if(a[i][2] <= 41)
        {
            printf("%d \n",a[i][0]*a[i][1]*a[i][2]);
        }
    }
}*/
