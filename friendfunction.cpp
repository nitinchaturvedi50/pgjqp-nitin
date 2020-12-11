
#include<iostream>
using namespace std;
class A
{
    private: int num1,num2;
    public:void display()
    {
        cout<<"enter the two no.";
        cin>>num1>>num2;

    }friend void add(A obj);
};
void add(A obj)
{
    int result;
    result=obj.num1+obj.num2;
    cout<<"result is:"<<result;

};
int main()
{
    A d1;
    d1.display();
    add(d1);
}
