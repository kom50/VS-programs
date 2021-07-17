#include<stdio.h>
 int main(){
     int n, f, i;
     printf("Enter a number :- ");
     scanf("%d", &n);

     f = 1;
     for(i = 1; i < n; i++){
          f *= i;
     }
     printf("Factorial : %d", f);
     return 0;
 }
