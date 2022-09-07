#include <iostream>
#include <cmath>
using namespace std;

/**
   Computes the area of a triangle.
   @param x1 the x-coordinate of the first corner
   @param y1 the y-coordinate of the first corner
   @param x2 the x-coordinate of the second corner
   @param y2 the y-coordinate of the second corner
   @param x3 the x-coordinate of the third corner
   @param y3 the y-coordinate of the third corner
   @return the area of the triangle
*/

double area(double x1, double y1, double x2, double y2, double x3, double y3)
{

   double _x1,_y1,_x2,_y2;
   _x1 = x1 - x3;
   _y1 = y1 - y3;
   _x2 = x2 - x3;
   _y2 = y2 - y3;
   
   double result = fabs(_x1 * _y2 - _x2 * _y1) / 2;
   return result;

}

int main()
{
   double x1;
   double y1;
   double x2;
   double y2;
   double x3;
   double y3;
   
   cin >> x1;
   cin >> y1;
   cin >> x2;
   cin >> y2;
   cin >> x3;
   cin >> y3;
   
   cout << area(x1, y1, x2, y2, x3, y3) << endl;
   
   return 0;
}
