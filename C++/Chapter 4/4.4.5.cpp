#include <iostream>
using namespace std;

/**
   Return true when a number is even.
   @param n the number to check
   @return true when n is even
*/
bool is_even(int n)
{
   return ((n%2)-1);
}

int main() 
{
   int num; 
   cin >> num;
   
   if (is_even(num))
   {
      cout << "true" << endl;
   }
   else
   {
      cout << "false" << endl;
   }

   return 0;
}
