#include<iostream>
 using namespace std;
 class A {
     public:
        void sayHello(){
            cout<<endl<<"Parent class (:";
        }
 };

 class B : public A{
     public:
         void sayHello(){
             cout<<endl<<"Child class (:";
         }
 };

 int main(){
     B *b = new B();
     b->sayHello();
     A *b1 = new B();
     b1->sayHello();
     A *b2 = new A();
     b2->sayHello();
    // B *b3 = new A();  //Error
    // b3->sayHello();
 }
