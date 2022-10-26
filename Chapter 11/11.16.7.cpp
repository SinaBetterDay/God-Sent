#include <cmath>
using namespace std;

struct Point
{
   double x;
   double y;
   Point* next;
};

double path_length(Point* first)
{
   double result = 0.0;

   Point* p = first;
   
   while (p != nullptr)
   {
      Point* q = p->next;
      if (q != nullptr)
      {
         double xDist = p->x - q->x;
         double yDist = p->y - q->y;
         result = result + sqrt(pow(xDist,2) + pow(yDist,2));
      }
      p = p->next;
   }

   return result;
}
