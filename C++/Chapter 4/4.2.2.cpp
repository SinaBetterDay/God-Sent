#include <iostream>
#include <math.h>
using namespace std;

/** 
   Computes the volume of a balloon. 
   @param width the horizontal diameter of the balloon 
   @param height the vertical diameter of the balloon 
*/
double balloon_volume(double width, double height)
{
  const double PI = 3.14159265358979323846;
  double a = height / 2;
  double c = width / 2;
  double volume = 4 * PI * a * c * c / 3;
  return volume;
}
int main() 
{
   double width;
   double height;
   cin >> width;
   cin >> height;
   double volume = balloon_volume(width, height);
   cout << "Volume: " << 
      round( volume * 100.0 ) / 100.0 << endl;
   return 0;
}
