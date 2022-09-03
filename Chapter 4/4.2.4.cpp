#include <iostream>
using namespace std;
double square_area(double side_length)
{
  double area = side_length * side_length;
  return area;
}
int main() 
{
   double square_side_length;
   cin >> square_side_length;
   double area = square_area(square_side_length);
   cout << area << endl;
   return 0;
}
