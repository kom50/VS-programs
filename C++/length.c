#include<stdio.h>
#include<stdlib.h>
 struct Node {
 	int data;
 	struct Node *next;
 };
 
 void insert(struct Node **head, int data){
 	struct Node *newN, *temp;
 	newN = malloc(sizeof(struct Node));
 	newN->data = data;
 	newN->next = NULL;
 	if(*head == NULL)
 	   *head = newN;
 	else{
 		temp = *head;
 		while(temp->next != NULL){
 			temp = temp->next;
 		}
 		temp->next = newN;
	 }
 }
 
 void show(struct Node **head){
 	struct Node *temp;
 	temp = *head;
 	while(temp != NULL){
 		printf("%5d", temp->data);
 		temp = temp->next;
	 }
 }
 
 int length(struct Node **head){
 	struct Node *temp;
 	int count = 0;
 	temp = *head;
 	if(*head == NULL)
 	 return 0;
 	else{
 		temp = *head;
 		while(temp != NULL){
 			count++;
 			temp = temp->next;
		 }
	 }
	 return count;
 }
 int main(){
 	struct Node *head = NULL;
 	insert(&head, 12);
 	insert(&head, 50);
 	insert(&head, 60);
 	insert(&head, 60);
 	show(&head);
 	printf("\nlenght  %d", length(&head));
 	return 0;
 }
