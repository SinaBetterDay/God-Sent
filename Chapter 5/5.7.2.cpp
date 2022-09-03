#include <iostream>
using namespace std;

int all_matches(
   int values[], int size, int matches[], int a, int b)
  {
    int count = 0;
    for (int k = 0; k < size; k++)
    {
      int v = values[k];
      if (a <= v && v <= b)
      {
        matches[count] = v;
        count++;
      }
    }
    return count;
}
