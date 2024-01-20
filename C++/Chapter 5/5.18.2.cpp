#include <iostream>
using namespace std;

int main() 
{
   int len;
   cin >> len;
   int values[len];
   
   for (int i = 0; i < len; i++)
   {
      cin >> values[i];
   }

   int pos = 0;
   bool found = false;
  while (pos < len && !found)
  {
    if (values[pos] == 0) { found = true; }
    else { pos++; }
  }
  for (int i = pos + 1; i < len; i++)
  {
    values[i - 1] = values[i];
  }
  if (found) { values[len - 1] = 0; }

   for (int j = 0; j < len; j++)
   {
      cout << values[j];
      if (j != len - 1) {cout << " ";}
   }
   
   return 0;
}
