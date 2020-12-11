//constructor and destructor
#include<iostream>
using namespace std;
class A
{   int num;
    public:A()
    {
        num=10;
        cout<<num;
    }
    ~A()
    {
        cout<<"distructor";
    }
};
int main()
{
    A d1;
    A d2;

}
