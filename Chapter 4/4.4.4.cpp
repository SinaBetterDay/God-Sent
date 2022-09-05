#include <iostream>
using namespace std;

/**
   Return true when a number is even.
   @param n the number to check
   @return true if n is even
*/
bool is_even(int n)
{
   bool result;

   if (n%2==0)
   {
      result = true;
   }
   else
   {
      result = false;
   }

   return result;
}

int main()
{
   int n;
   cin >> n;
   
   if (is_even(n))
   {
      cout << "true" << endl;
   }
   else
   {
      cout << "false" << endl;
   }
   
   return 0;
}
