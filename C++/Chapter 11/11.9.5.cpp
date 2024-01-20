#include <iostream>
#include <vector>
using namespace std;

int main()
{
  vector<int> rows[10];
  for (int i = 0; i < 10; i++)
  {
    for (int j = 0; j <= i; j++)
    {
      rows[i].push_back(0);
    }
  }
  
  for (int i = 0; i < 10; i++)
  {
    for (int j = 0; j < rows[i].size(); j++)
    {
      cout << rows[i].at(j);
    }
    cout << endl;
  }
  return 0;
}
