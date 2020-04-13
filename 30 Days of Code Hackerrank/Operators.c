#include<stdio.h>
int main()
{
    float mealCost,tip,tax;
    scanf("%f\n%f\n%f",&mealCost,&tip,&tax);
    tip = (tip*mealCost)/100;
    tax = (tax*mealCost)/100;
    int total;
    mealCost = mealCost+tip+tax;
    if(mealCost-(int)mealCost >= 0.5)
    {
         total = (int)mealCost +1;
    }
    else {
        total = (int)mealCost;
    }
    printf("%d",total);
}
