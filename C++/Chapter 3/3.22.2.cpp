#include <iostream>
#include <string>
using namespace std;

int main()
{
  string word;
  cin >> word;
  int n = word.length();
  for (int i = 1; i <= n; i++)
  {
    for (int j = 0; j <= n - i; j++)
    {
      cout << word.substr(j, i) << endl;
    }
  }
   return 0;
}
