#include<iostream>
using namespace std;
class A
{
    private: int num1,num2;
    public:void display()
    {
        cout<<"enter the two no.";
        cin>>num1>>num2;

    }friend class B;

};
class B
{
    private :int result;
    public: void add(A obj)
    {
        result=obj.num1+obj.num2;
        cout<<"result is:"<<result;
    }
};
int main()
{
    A d1;
    B d2;
    d1.display();
    d2.add(d1);
}
