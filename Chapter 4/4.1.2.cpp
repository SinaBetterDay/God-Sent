#include <iostream>
#include <math.h>
using namespace std;

double balloon_radius(double width, double height)
{
   return (width * width) / (8 * height) + height / 2;
}

double balloon_volume(double width, double height)
{
   return (4.0 / 3) * M_PI * 
      pow(balloon_radius(width, height), 3);
}

int main() 
{
  double height = 4.5;
  double width = 3;
  double volume1 = balloon_volume(width, height);
  double volume2 = balloon_volume(width + 1, height + 1);
  double change = volume2 - volume1;
  cout << "Original volume: " << volume1 << endl;
  cout << "Change: " << change << endl;
  change = balloon_volume(width + 2, height + 2) - volume2;
  cout << "Change: " << change << endl;
  return 0;
}
