#include<iostream>
using namespace std;
int main()
{
    int a,b,*p,*q,c;
    p=&a;
    q=&b;

    cout<<"enter the two numbers";
    cin>>a>>b;
    c=*p+*q;

    cout<<"c is:"<<c;
    cout<<p;
}
