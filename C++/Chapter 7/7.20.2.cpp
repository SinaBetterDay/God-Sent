#include <iostream>
#include <string>
using namespace std;

class Bug
{
public:
   // Provide the public interface for get_position, reset, and up
   void reset();
   void up();
   int get_position();
private:
   string climbed;
};

// Implement the get_position, reset, and up member functions
void Bug::reset()
{
   climbed = "";
}
void Bug::up()
{
   if (climbed < "----------")
   {
      climbed += "-";
   }
   if (climbed == "----------")
   {
      climbed = "";
   }
}
int Bug::get_position()
{
   return climbed.length()*10;
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
   cout << "Expected: 20" << endl;
   itsy_bitsy.up();
   itsy_bitsy.up();
   itsy_bitsy.up();
   cout << itsy_bitsy.get_position() << endl;
   cout << "Expected: 30" << endl;
   for (int i = 1; i <= 8; i++) { bugsy.up(); }
   cout << bugsy.get_position() << endl;
   cout << "Expected: 0" << endl;
   bugsy.up();
   cout << bugsy.get_position() << endl;
   cout << "Expected: 10" << endl;
   
   return 0;
}
