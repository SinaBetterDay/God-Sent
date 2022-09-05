#include <iostream>
using namespace std;

/**
   Computes the area of a square of a given side length.
   @param side_length the length of a side
   @return the area of the square
*/
double square_area(double len)
{
   double area = len*len;
   return area;
}

int main()
{
   double length;
   cin >> length;
   cout << square_area(length) << endl;
   
   return 0;
}
