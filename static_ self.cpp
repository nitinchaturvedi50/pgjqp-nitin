#include<iostream>
using namespace std;

/*class game
{
#include<iostream.h>
#include<conio.h>*/

class game
{
static int presentplayers;
public:static  void displaygame()
{
presentplayers++;
cout<<"presentplayers"<<endl;
}
/*static void reset()
{
presentplayers=0;
}

static void inc()
{
presentplayers++;
}
static void show()
{
cout<<presentplayers<<endl;
}*/

};int game:: presentplayers=1;

main()
{
/*game.reset()
game player1;
player1.show();
game player2;
player2.show();*/
/*game d1;
d1.displaygame();
d1.displaygame();*/
game::displaygame();
}

