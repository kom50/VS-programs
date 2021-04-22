#include<stdio.h>
#include<stdlib.h>
 struct Node{
 	int data;
 	struct Node *next;
 };
 void show(struct Node **head){
 	struct Node *temp;
 	temp = *head;
 	while(temp != NULL){
 		printf("%5d", temp->data);
 		temp = temp->next;
	 }
 }
  void insertSorted(struct Node **head, int data){
 	struct Node *temp, *prev, *newN;
 	newN = malloc(sizeof(struct Node));
 	newN->next = NULL;
 	newN->data = data;
 	if(*head == NULL){
 		*head = newN;
	 }
	 else{
	 	temp = *head;
	 	if(temp->data > data){
	 		newN->next = temp;
	 		*head = newN;
		 }
		 else{
		 	temp = *head;
		 	while(temp->next != NULL){
		 		prev = temp;
		 		temp = temp->next;
		 		if(temp->data > data){
		 			newN->next = temp;
		 			prev->next = newN;
		 			return;
				 }
			 }
			 temp->next = newN;
		 }
	 }
 }
 int main(){
    struct Node *head = NULL, *tail = NULL;
    int n, data, i;
 	printf("How many numbers u want to enter :- ");
	scanf("%d",&n);
	for(i = 1; i <= n; i++){
		printf("Enter a number :- ");
		scanf("%d", &data);
		insertSorted(&head, data);
	}
	printf("Data is ");
 	show(&head);
 	return 0;
 }
