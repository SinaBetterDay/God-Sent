#include <iostream>
#include <vector>
using namespace std;

int main()
{
  vector<int*> rows;
  for (int i = 0; i < 10; i++)
  {
    int* row = new int[i+1];
    rows.push_back(row);
    for (int j = 0; j <= i; j++)
    {
      rows[i][j] = 0;
    }
  }
  
  for (int i = 0; i < rows.size(); i++)
  {
    for (int j = 0; j <= i; j++)
    {
      cout << rows[i][j] << " ";
    }
    cout << endl;
  }
  
  while (rows.size() > 0)
  {
    delete[] rows[rows.size() - 1];
    rows.pop_back();
  }
  
  return 0;
}
