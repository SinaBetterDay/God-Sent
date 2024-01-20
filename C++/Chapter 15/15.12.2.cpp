#include <iostream>
using namespace std;

#include "critter.h"

/**
   A nervous critter moves back and forth between positions 0 and 1.
*/

class NervousCritter : public Critter
{
public:
   void act();
};

void NervousCritter::act()
{
  if(Critter::get_position() == 0)
   {
      move(1);
   }
   else
   {
      move(-1);
   }
}


int main()
{
   NervousCritter critter1;
   critter1.act();
   cout << critter1.get_history() << endl;
   cout << "Expected: [move to 1]" << endl;
   critter1.act();
   cout << critter1.get_history() << endl;
   cout << "Expected: [move to 1, move to 0]" << endl;
   critter1.act();
   cout << critter1.get_history() << endl;
   cout << "Expected: [move to 1, move to 0, move to 1]" << endl;
   critter1.act();
   cout << critter1.get_history() << endl;
   cout << "Expected: [move to 1, move to 0, move to 1, move to 0]" << endl;
   
   return 0;
}
