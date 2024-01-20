#include <cmath>
using namespace std;

struct Point
{
   double x;
   double y;
};

double path_length(Point path[], int size)
{
   double result = 0.0;

   for (int i = 1; i < size; i++)
   {
      double xDist = path[i].x - path[i-1].x;
      double yDist = path[i].y - path[i-1].y;
      result += sqrt(pow(xDist,2) + pow(yDist,2));
   }


   return result;
}
