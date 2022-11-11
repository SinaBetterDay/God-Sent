#include <iostream>
using namespace std;

#include "critter.h"

/**
   A sloth eats and sleeps.
*/
class Sloth : public Critter
{
public:
   Sloth();
   void act();
private:
   int flag;
};

Sloth::Sloth()
{
   flag = 0;
}

void Sloth::act()
{
   if (flag == 0)     
   {
      add_history("eat");
      flag = 1;
   }
   else
   {
      add_history("sleep");
      flag = 0;
   }
}

int main()
{
   Sloth sloth;
   sloth.act();
   cout << sloth.get_history() << endl;
   cout << "Expected: [eat]\n" << endl;
   sloth.act();
   cout << sloth.get_history() << endl;
   cout << "Expected: [eat, sleep]\n" << endl;
   sloth.act();
   cout << sloth.get_history() << endl;
   cout << "Expected: [eat, sleep, eat]\n" << endl;
   sloth.act();
   cout << sloth.get_history() << endl;
   cout << "Expected: [eat, sleep, eat, sleep]" << endl;
   
   return 0;
}
