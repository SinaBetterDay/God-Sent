#include <iostream>
using namespace std;

int main()
{
  int a;
  int b;
  cin >> a;
  cin >> b;
  
  int* p;
  if (a < b)
  {
    p = &a;
  }
  else
  {
    p = &b;
  }
  *p = 0;
  
  cout << "a:" << a << endl;
  cout << "b:" << b << endl;
  
  return 0;
}
