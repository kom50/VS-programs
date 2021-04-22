#include<stdio.h>
#include<stdlib.h>
 struct queue{
 	int arr[15];
 	int r, f, s, cSize;
 };
 
 void enqueue(struct queue *q1, int data){
 	if((q1->r + 1) % q1->s == q1->f){
 		printf("Queue overflow...");
	 }
	 else{
	 	if(q1->f == - 1)
	 	   q1->f = 0;
	 	q1->r = (q1->r + 1) % q1->s;
	 	q1->arr[q1->r] = data;
	 	q1->cSize++;
	 	printf("\n size %d enqueueu data : %d   %d",q1->cSize, q1->r, q1->arr[q1->r]);
	 }
 }
 void show(struct queue *q){
 	int  d = 0;
 	if(q->cSize == 0){//q->f == -1 || ->f > q->r){
 		printf("Queue underflow...");
	 }
	 else{
	 	printf("\nData : \n ");
		 d = q->f;
		 do{
		 	printf("d %d %5d %4d\n",d, d % q->s, q->arr[d % q->s]);
		 	d++;
		 }while((d - 1 )% q->s != q->r);
	 }
 }
 
 void dequeue(struct queue *q){
 	int i = -1;
 	if(q->cSize == 0){   //(q->f > q->r){
 		printf("Queue underflow...");
	 }
	 else{
	 	q->f = (q->f ) % q->s;
	 	i = q->arr[q->f];
	 	q->f++;
	 	q->cSize--;
	 }
	 printf("\n Size %d , %d  deleted data : %d",q->cSize, q->f, i);
 }
 int main(){
 	
 	struct queue *q1 = malloc(sizeof(struct queue));
 	q1->f = -1;
	q1->r = -1;
	q1->s = 7;
	q1->cSize = 0;
 	
 	enqueue(q1, 34);
 	enqueue(q1, 24);
 	enqueue(q1, 54);
 	enqueue(q1, 20);
 	enqueue(q1, 10);
 	enqueue(q1, 99);
 	printf("\nSize r %d f  %d",q1->r, q1->f);
    show(q1);
	dequeue(q1);
	dequeue(q1);
	//enqueue(q1, 14);
	//enqueue(q1, 10);
	printf("\n New Size r %d f  %d",q1->r, q1->f);
 	show(q1);
 /*	enqueue(q1, 14);
 	enqueue(q1, 94);
    enqueue(q1, 4);
 	printf("\nSize r %d f  %d",q1->r, q1->f);
	show(q1);
 	
 	printf("\nSize %d  %d",q1->r, q1->arr[q1->r]);
 	*/
 	return 0;
 }
