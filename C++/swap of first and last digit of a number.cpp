#include<iostream>
 using namespace std;
 int main(){
     int n = 13458, n1;
     int l, f;
     l = n % 10;
     n = n / 10;
     n1 = n;
     int base = 1;
     while(n1 != 0){
         base *= 10;
         n1 /= 10;
     }

     f = n % base;
     n = n / base;
     printf("n %d base %d f %d  l %d",n, base, f, l);
     return 0;
 }
