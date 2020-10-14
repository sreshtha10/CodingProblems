#include<stdio.h>
int properDivisor(int number,int divisor){
    if(divisor == 1){
        return 0;
    }
    if(number%divisor == 0){
        printf("%d ",divisor);
        return divisor + properDivisor(number,divisor-1);
    }
    return properDivisor(number,divisor-1);
}

int main(void){
    int number;
    printf("Enter the number\n");
    scanf("%d",&number);
    int sum = properDivisor(number,(int)number/2);
    printf("\nSum is %d",sum);
    return 0;
}

