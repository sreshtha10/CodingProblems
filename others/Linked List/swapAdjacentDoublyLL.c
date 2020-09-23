    
#include<stdio.h>
#include<stdlib.h>
typedef struct node {
    struct node *prev;
    int info;
    struct node *next;
}Node;


void printList(Node* start){
    Node *p;
    p = start;
    if(start == NULL){
        printf("List is empty\n");
        return;
    }
    while(p!=NULL){
        printf("%d ",p->info);
        p = p->next;
    }
    printf("\n");
    return;
}

Node * add_at_beg(Node *start,int data){
    Node *tmp = (Node*)malloc(sizeof(Node));
    tmp->info = data;
    tmp->next = start;
    tmp->prev = NULL;
    if(start != NULL){
        start->prev = tmp;
    }
    start = tmp;
    return start;
}


Node* add_at_end(Node* start,int data){
    Node* tmp,*p;
    tmp =(Node*)malloc(sizeof(Node));
    tmp->info = data;
    p = start;
    while(p->next != NULL){
        p = p->next;
    }
    tmp->next = p->next;
    tmp->prev = p;
    p->next = tmp;
    return start;
}



// Swap adjacent elements by exchanging links.

Node *swapAdjacent(Node* start){
    Node * r,*p,*q;
    p = start;
    r = start;
    q = start->next;
    while(p->next != NULL){
        if(p == start){
            start = q;
            p->next = q->next;
            if(q->next != NULL){
                q->next->prev = p;
            }
            p->prev = q;
            q->prev = NULL;
            q->next = p;
        }
        else{
            r->next = q;
            p->next = q->next;
            if(q->next != NULL){
                q->next->prev = p;
            }
            p->prev = q;
            q->prev = r;
            q->next = p;
        }
        r = p;
        if(p->next != NULL){
            p = p->next;
        }
        if(p->next != NULL){
            q = p->next;
        }
    }
    return start;
}
int main(void){
    Node * start = NULL;
    start = add_at_beg(start,1);
    start = add_at_end(start,2);
    start = add_at_end(start,3);
    start = add_at_end(start,4);
    printList(start);
    start = swapAdjacent(start);
    printList(start);
}
