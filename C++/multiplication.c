#include<stdio.h>
 int mul(int x, int y){
 	if(y == 0)
 	  return 0;
 	else
 	  return (x + mul(x, y -1));
 }
 
 int main(){
 	
 	int a, b, m;
	printf("Enter two numbers :- ");
	scanf("%d%d", &a, &b);
	m = mul(a, b);
 	printf("Multiply of %d and %d is %d ", a, b, m);
    return 0; 	
 }
