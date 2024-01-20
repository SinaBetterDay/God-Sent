#include "van.h"

// Implement the member functions here

Van::Van(int max_passengers)
{
   capacity = max_passengers;
   passengers = 0;
   miles_driven = 0;
}

void Van::board(int boarding_passengers)
{
   for (int i=0; passengers < capacity && i < boarding_passengers; i++)
   {
      passengers++;
   }
}

void Van::drive(double distance)
{
   miles_driven += distance;
   passengers = 0;
}

int Van::get_passengers() const
{
   return passengers;
}

double Van::get_miles_driven() const
{
   return miles_driven;
}
