#include <iostream>
using namespace std;

int main() 
{
   const int LENGTH = 100;
   int a[LENGTH];
   for (int i = 0; i < LENGTH; i++) {a[i] = i;}
   
  for (int i = 99; i >= 0; i--)
  {
    cout << a[i];
    if (i > 0) {cout << ", ";}
  }
   return 0;
}
