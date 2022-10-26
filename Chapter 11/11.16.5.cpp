#include <cmath>
using namespace std;

struct Point
{
   double x;
   double y;
};

double distance(Point a, Point b)
{
   double xDist = b.x - a.x;
   double yDist = b.y - a.y;
   return sqrt(pow(xDist,2) + pow(yDist,2));   
}
