#include<stdio.h>
#include<stdlib.h> //I used dynamic memory allocation.


//Node - An element of a linked list which contain two parts: 1. Data 2. Link to the next node.
struct node {
    int info;
    struct node *link;
};
struct node *l2 = NULL;
struct node *l3 = NULL;

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
        //After accessing the first element, we use link part of the structure to access the next element.
        p = p->link;
    }
    printf("\n");
    
}// end of display function

struct node *add_at_end(struct node *start, int data)// To add an element at the end of the linked list first we need to find the last element and then point the last element to the new node and new node to null.
{
    struct node *tmp;
    struct node *p;
    p = start;
    tmp = (struct node *)malloc(sizeof(struct node));
    tmp->info = data;
    if(start == NULL){
        start = tmp;
        tmp->link = NULL;
        return start;
    }
    while(p->link != NULL)
    {
        p = p->link;
    }
    tmp->link = NULL;
    p->link = tmp;
    return start;
    
}

struct node* split_even_odd(struct node* l1){
    struct node*p = l1;
    while(p!=NULL){
        struct node* tmp = (struct node*)malloc(sizeof(struct node));
        tmp->info= p->info;
        if(p->info%2 == 0){
            tmp->link = l2;
            l2 = tmp;
        }
        else{
            
            tmp->link = l3;
            l3 = tmp;
        }
        p = p->link;
    }
    
    return l1;
    
}




int main()
{
    
    struct node *l1 = NULL;
    l1 = add_at_end(l1,1);
    l1 = add_at_end(l1,2);
    l1 = add_at_end(l1,3);
    l1 = add_at_end(l1,4);
    l1 = add_at_end(l1,5);
    display(l1);
    l1 = split_even_odd(l1);
    display(l2);
    display(l3);
    return 0;
}
