#include<iostream>
using namespace std;
class alphabet
{   char a,e,i,o,u;
    public:void display()
    {
        cout<<"enter the alphabet";
        cin>>a,e,i,o,u;

    if(a)
    {
        cout<<"vowel";
    }
    else
    {
        cout<<"consonant";
    }

    }
};
int main()
{
    alphabet d1;
    d1.display();
}
