#include<iostream>
 using namespace std;
 class A{
 	private:
 		int a, b;
 	public:
 		A(int a){
 			this->a = a; 
		}
	   A(int a, int b){
	   	this->a = a;
		   this->b = b; 
	   }
		void show(){
			cout<<"a = "<<a<<"  b  "<<b;
		}
		void put(A a){
			cout<<endl<<"a "<<a.a;
		}
		A& get(A &b){
			return b; 
		}
		
 };
 
 int main(){
 	
 	A a1(90);
 	a1.show();
 	
 	A a2 = a1;
 	cout<<"\nAddress of a1 = "<<&a1;
 	cout<<"\nAddress of a2 = "<<&a2;
 	
 	A a3(a1);
    a3.get(a1);
    a2 = A(9);
    a1 = a2.get(a2);
    cout<<"\nAddress of a2 = "<<&a2;
    printf("\n %d %d", &a2, &a1);
    
    a1 = a3;
    a3.show();
    a1.show();
    printf("\n %d %d", &a3, &a1);
    
    A a5(23, 45);
    a5.show();
    
    A a6(a5);
    a5.show();
 	return 0;
 }
