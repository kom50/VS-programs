#include<stdio.h>
 int removeDigit(int n, int d){
 	int newN = 0, d1, base = 1;
 	while(n > 0){
 		d1 = n % 10;
 		if(d1 != d){
 		   newN = newN + base * d1;
		   base *= 10;	
		}
		n /= 10;
	 }
 	return newN; 	
 }
 int main(){
 	int n, d;
 	printf("Enter a number :- ");
 	scanf("%d", &n);
 	printf("Enter a digit which you want to remove from number :- ");
 	scanf("%d",&d);
 	n = removeDigit(n, d);
 	printf("\nNew number = %d", n);
 	return 0;
 }
