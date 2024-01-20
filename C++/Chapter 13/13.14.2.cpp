#include "interval.h"

Interval::Interval(int lower_bound, int upper_bound)
{
   low = lower_bound;
   high = upper_bound;
}

bool Interval::operator==(const Interval& other) const
{
   if (this->low == other.low and this->high == other.high)
   return true;
   else
   return false;
}

bool operator!=(const Interval& a, const Interval& b)
{
   if (a == b)
   return false;
   else
   return true;
}
