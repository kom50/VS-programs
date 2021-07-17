#include<stdio.h>
 int main(){
 	
 	int n, i, flag;
 	printf("Enter a number :- ");
 	scanf("%d", &n);
 	
 	i = 2;
 	flag = 0;
 	while(i <= n / 2){
 		if(n % i == 0){
 			flag = 1;
 			break;
		 }
		i++;
	}
	if(flag == 1)
	   printf("%d is not a prime number.", n);
	else
	   printf("%d is a prime number.", n);
	 
 	return 0;
 }
