#include<stdio.h>
#include<string.h>
int main(){
    int hh,mm,ss;
    char time[3];
    scanf("%d:%d:%d%s",&hh,&mm,&ss,time);
    if ((strcmp(time,"PM")== 0 && hh!=12))
    {
        hh+=12;
    }
    if (strcmp(time, "AM")==0 && hh == 12)
    {
        hh = 0;
    }
    printf("%02d:%02d:%02d",hh,mm,ss);
}
