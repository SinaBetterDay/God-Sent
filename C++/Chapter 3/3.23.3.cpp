#include <iostream>
using namespace std;

int main() 
{
   string str;
   cin >> str;
  for (int i = 0; i < str.length(); i++)
  {
    bool found = false;
    int position = 0;
    string target = str.substr(i, 1);
    while (!found && position < str.length())
    {
      string ch = str.substr(position, 1);
      if (ch == target && position != i)
      { 
        found = true;
      }
      else { position++; }
    }
    if (!found) { cout << target << endl; }
  }
   return 0;
}
