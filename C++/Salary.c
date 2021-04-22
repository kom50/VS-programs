#include<stdio.h>
#include<conio.h>
  int main(){
  	int s, qul;
  	char gen;
  	printf("Enter gender (m, f) :- ");
  	scanf("%c", &gen);
  	printf("Enter sarvice of time :-  ");
  	scanf("%d", &s);
  	printf("Enter qualification(0, 1) :- ");
  	scanf("%d", &qul);
  
  
    printf("s %d, qul %d, gen %c", s, qul, gen);
  	
  	return 0;
  }
