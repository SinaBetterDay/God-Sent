#include <iostream>
#include <vector>
using namespace std;

int main() 
{
  vector<string> names = {"Eve", "Fay", "Alfredo", "Mia", "Carlos"};
  for (int i = names.size() - 1; i >= 0; i--)
  {
    cout << names[i] << endl;
  }
}
