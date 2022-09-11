#include <iostream>
#include <vector>
using namespace std;

double corner_average(vector<vector<double>> values)
{
   int rows = values.size();
   int columns = values[0].size();
   double sum = 0;
   sum = values[rows-1][columns-1] + values[0][0] + values[0][columns-1] + values[rows-1][0];
   return sum / 4;
}
