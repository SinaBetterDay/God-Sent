#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
  string str;
  double amount;
  
  cin >> str;
  
  if (str[0] == '$')
  {
    const char* p = str.c_str();
    amount = atof(p + 1);
  }
  else
  {
    amount = atof(str.c_str());
  }
  
  cout << fixed << setprecision(2) << amount << endl;
  
  return 0;
}
