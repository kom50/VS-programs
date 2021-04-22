#include<iostream>
 using namespace std;
 int mul(int x, int y){
 	if(y == 0)
 	  return 0;
 	else
 	  return (x + mul(x, y -1));
 }
 
 int main(){
 	
 	int a, b, m;
	cout<<"Enter two numbers :- ";
	cin>>a>>b;
	m = mul(a, b);
 	cout<<"Multiply of "<<a<<" and "<<b<<" is "<<m;
    return 0; 	
 }
