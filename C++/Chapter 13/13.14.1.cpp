#include "interval.h"

Interval::Interval(int lower_bound, int upper_bound)
{
   low = lower_bound;
   high = upper_bound;
}

void Interval::print(ostream& out) const
{
   out << "(" << low << ", " << high << ")" << endl;
}

Interval Interval ::operator+(const Interval& other) const
{
   if(low > other.low)
   {
      return Interval(other.low,high);
   }
   else if (high < other.high)
   {
      return Interval(low, other.high);
   }
   else
   {
      return Interval(low,high);
   }

}
