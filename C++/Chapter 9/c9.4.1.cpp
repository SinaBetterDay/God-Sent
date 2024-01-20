#include <iostream>
using namespace std;

int main()
{
  char ch;
  double price;
  cin >> ch;
  if (ch != '$')
  {
    cin.unget();
  }
  cin >> price;
  cout << price;
  
  return 0;
}
