#include<iostream>
using namespace std;
class staticEx
{
    //we want to maintain only 1 copy of variable between multiple objects , in that case we will use static concept
    //As soon as we are declaring any variable/function as static, it gets memory there itself.
   static  int count;
    public: static void display()
    {
      count++;
      cout<<count<<endl;
    }
};
int staticEx ::count=0; //:: is known as scope resolution operator
int main()
{
   staticEx e1;
    e1.display();
    e1.display();
    staticEx e2;
    e2.display();
    e2.display();
    //staticEx::display();

}
