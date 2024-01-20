#include <iostream>
using namespace std;

int* find(int values[], int size, int target)
{
  int* p = values;
  while (p != values + size)
  {
    if (*p == target)
    {
      return p;
    }
    p++
  }
  return nullptr;
}
