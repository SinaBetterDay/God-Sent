#include <iostream>
#include <vector>

using namespace std;

int main()
{
   vector<double> inputs;
double value;
while (cin >> value)
{
if (value > 0)
{
inputs.push_back(value);
}
}
   for (int i = 0; i < inputs.size(); i++)
   {
      if (i > 0){ cout << " "; }
      cout << inputs.at(i);
   }
   return 0;
} 
