#include <iostream>
using namespace std;

#include "critter.h"

/**
   A ForgetfulCritter can't remember its history.
*/
class ForgetfulCritter : public Critter
{
public:
   void add_history(string event);
};
void ForgetfulCritter::add_history(string event)
{
   Critter::add_history("?");
}

int main()
{
   ForgetfulCritter dopey;
   dopey.add_history("eat");
   cout << dopey.get_history() << endl;
   cout << "Expected: [?]\n" << endl;
   dopey.move(10);
   cout << dopey.get_history() << endl;
   cout << "Expected: [?, ?]" << endl;
   
   return 0;
}
