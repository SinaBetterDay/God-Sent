#include <iostream>
using namespace std;
bool mystery(int n)
{
  return n % 2 == 0;
}

int main()
{
   int n;
   string value = "false";
   
   cin >> n;
   
   if (mystery(n))
   {   
      value = "true";
   }
   
   cout << value << endl;
   
   return 0;
}
