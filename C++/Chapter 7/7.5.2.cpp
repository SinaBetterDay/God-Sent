#include <iostream>
using namespace std;
/**
   A simulated digital clock.
*/
class Clock
{
public:
   /**
      Sets the clock to 00:00.
   */
   void reset();

   /**
      Advances this clock to the next minute.
   */
   void pulse();
   
   /**
      Gets the hours of this clock.
      @return the hours (between 0 and 23)
   */
   int get_hours() const;
   
   /**
      Gets the minutes of this clock.
      @return the minutes (between 0 and 59)
   */
   int get_minutes() const;
private:
   int minutes_from_midnight;
};


void Clock::reset()
{
   minutes_from_midnight = 0;
}
void Clock::pulse()
{
   minutes_from_midnight += 1;
}
int Clock::get_hours() const
{
   if (minutes_from_midnight / 60 < 24)
   {
      return minutes_from_midnight / 60;
   }
   else
   {
      return 0;
   }
}
int Clock::get_minutes() const
{
   return minutes_from_midnight % 60;
}

int main()
{
   Clock my_clock; my_clock.reset();
   
   for (int i = 0; i < 100; i++) { my_clock.pulse(); }
   cout << my_clock.get_hours() << endl;
   cout << "Expected: 1\n" << endl;
   cout << my_clock.get_minutes() << endl;
   cout << "Expected: 40\n" << endl;
   
   for (int i = 0; i < 70; i++) { my_clock.pulse(); }
   cout << my_clock.get_hours() << endl;
   cout << "Expected: 2\n" << endl;
   cout << my_clock.get_minutes() << endl;
   cout << "Expected: 50\n" << endl;
   
   for (int i = 0; i < 1270; i++) { my_clock.pulse(); }
   cout << my_clock.get_hours() << endl;
   cout << "Expected: 0\n" << endl;
   cout << my_clock.get_minutes() << endl;
   cout << "Expected: 0" << endl;
   
   return 0;
}
