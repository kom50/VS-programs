#include<stdio.h>
 void decToAny(int, int);
 int main(){
 	
 	int num, base;
 	//printf("Enter a number and base:- ");
 //	scanf("%d%d",&num, &base);
 	decToAny(15, 16);
 	return 0;
 }
 
 void decToAny(int data, int base){
 	int temp;
 	if(data == 0)
 	  return;
 	decToAny(data / base, base);
 	temp = ((temp = data % base) >= 10) ? temp + 55 : temp + 48;
 	printf("%c",temp);
 }
