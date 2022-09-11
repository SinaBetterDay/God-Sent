#include <iostream>
#include <vector>
using namespace std;

vector<int> negative_positions(vector<double> values)
{
   vector<int> result;
   for (int i=0; i<values.size(); i++)
   {
      if (values[i]<0)
      {
         result.push_back(i);
      }
   }

   return result;
}
