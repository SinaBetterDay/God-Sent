#include <iostream>
#include <vector>
using namespace std;

int main() 
{
  vector<double> values = {1.5, 2.5, 3.5, 4.5, 5.5};
  for (int i = 1; i <= values.size(); i++)
  {
    if (i > 1) { cout << ", "; }
    cout << values[values.size() - i];
  }
}
