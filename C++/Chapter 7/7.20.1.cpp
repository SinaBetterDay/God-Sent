#include <iostream>
#include <iomanip>
using namespace std;

class DigitalClock
{
public:
void pulse();
void reset();
string get_display() const;
private:
int hours;
int minutes;
};

string DigitalClock::get_display() const
{
ostringstream out;
out << setfill('0') << setw(2) 
   << hours << ":" << setw(2) << minutes;
return out.str();
}

void DigitalClock::pulse()
{
minutes++;
if (minutes == 60)
{
minutes = 0;
hours = (hours + 1) % 24;
}
}

void DigitalClock::reset()
{
minutes = 0;
hours = 0;
}

int main()
{
   DigitalClock my_clock; 
   my_clock.reset();
   
   for (int i = 0; i < 100; i++) { my_clock.pulse(); }
   cout << my_clock.get_display() << endl;
   cout << "Expected: 01:40\n" << endl;

   my_clock.reset();
   cout << "Resetting clock" << endl;
   cout << my_clock.get_display() << endl;
   cout << "Expected: 00:00\n" << endl;
   
   for (int i = 0; i < 170; i++) { my_clock.pulse(); }
   cout << my_clock.get_display() << endl;
   cout << "Expected: 02:50\n" << endl;
   
   for (int i = 0; i < 1270; i++) { my_clock.pulse(); }
   cout << my_clock.get_display() << endl;
   cout << "Expected: 00:00" << endl;
   
   return 0;
}
