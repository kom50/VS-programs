#include<iostream>
 using namespace std;
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
 	cout<<"Enter a number :- ";
 	cin>>n;
 	cout<<"Enter a digit which you want to remove from number :- ";
 	cin>>d;
 	n = removeDigit(n, d);
 	cout<<"New number = "<<n;
 	return 0;
 }
