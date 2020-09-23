#include<stdio.h>
#include<stdlib.h> 
struct node {
    int info;
    struct node *link;
};
void display(struct node *start)
{
    struct node *p;
    p = start;
    //If the start pointer points to nothing then list is empty.
    if (start == NULL)
    {
        printf("List is empty");
        return;
    }
    while(p != NULL)
    {
        printf("%d ",p->info);
        p = p->link;
    }
    printf("\n");
    
}
struct node *add_at_beg(struct node*start,int value)
{
    struct node *tmp;
    tmp = (struct node *)malloc(sizeof(struct node));
    tmp->info = value;
    tmp->link = start;
    start = tmp;
    return start;
}
struct node *add_at_end(struct node *start, int data){
    struct node *tmp;
    struct node *p;
    p = start;
    tmp = (struct node *)malloc(sizeof(struct node));
    tmp->info = data;
    while(p->link != NULL)
    {
        p = p->link;
    }
    tmp->link = NULL;
    p->link = tmp;
    return start;
    
}


//Swap first and last element by exchanging data

struct node* exchangeSE_data(struct node* start){
    struct node *p = start;
    if(start == NULL){
        return start;
    }
    while(p->link != NULL){
        p = p->link;
    }
    int tmp = start->info;
    start->info = p->info;
    p->info = tmp;
    
    return start;
}



int main(void)
{
    
    struct node *start = NULL;
    start = add_at_beg(start,1);
    start = add_at_beg(start,3);
    start = add_at_end(start,1);
    start = add_at_end(start,10);
    display(start);
    start = exchangeSE_data(start);
    display(start);
    return 0;
}
