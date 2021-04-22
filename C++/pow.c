#include<stdio.h>
 int power(int a, int b){
 	if(b == 0)
 	  return 1;
 	return a * power(a, b - 1);
 }
 
 int main(){
 	int a, b, p;
 	printf("Enter two numbers :- ");
 	scanf("%d%d", &a, &b);
 	p = power(a, b);
 	printf("Results = %d",p); 	
 	return 0;
 }
