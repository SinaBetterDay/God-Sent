#include <iostream>
using namespace std;

class Bug
{
public:
   int get_position() const;
   void reset();
   void up();
private:
   int position = 0;
};

int Bug::get_position() const
{
   return position;
}

void Bug::reset()
{
   position = 0;
}

void Bug::up()
{
   if (position < 100)
   {
      position += 10;
   }
   if (position == 100)
   {
      position = 0;
   }
}

int main()
{
   Bug bugsy;
   Bug itsy_bitsy;
   bugsy.reset();
   itsy_bitsy.reset();
   bugsy.up();
   bugsy.up();
   cout << bugsy.get_position() << endl;
   cout << "Expected: 20\n" << endl;
   itsy_bitsy.up();
   itsy_bitsy.up();
   itsy_bitsy.up();
   cout << itsy_bitsy.get_position() << endl;
   cout << "Expected: 30\n" << endl;
   for (int i = 1; i <= 8; i++) { bugsy.up(); }
   cout << bugsy.get_position() << endl;
   cout << "Expected: 0\n" << endl;
   bugsy.up();
   cout << bugsy.get_position() << endl;
   cout << "Expected: 10" << endl;
   
   return 0;
}
